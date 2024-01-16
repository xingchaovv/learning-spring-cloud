import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class QueryClientTest {

    @Test
    public void queryUsers() {
        ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:21201/order-with-users", String.class);
        System.out.printf("response: %s\n", response);
    }
}
