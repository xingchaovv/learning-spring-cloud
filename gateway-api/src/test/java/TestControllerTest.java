import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestControllerTest {

    @Test
    public void test01() {
        ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:21203/test", String.class);
        System.out.printf("response: %s\n", response);
    }

    @Test
    public void test02() {
        ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:21203/order-with-users", String.class);
        System.out.printf("response: %s\n", response);
    }

    @Test
    public void test03() {
        ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:21203/users", String.class);
        System.out.printf("response: %s\n", response);
    }
}
