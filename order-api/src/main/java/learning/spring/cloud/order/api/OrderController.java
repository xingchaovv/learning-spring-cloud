package learning.spring.cloud.order.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    LscUserAPI lscUserAPI;

    @GetMapping("/order-with-users")
    public List<String> orderWithUsers() {
        return lscUserAPI.queryUsers();
    }
}
