package learning.spring.cloud.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "lsc-user-api")
public interface LscUserAPI {

    @GetMapping(value = "/users")
    List<String> queryUsers();
}
