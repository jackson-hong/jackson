package kr.jackson;

import kr.jackson.domain.Order;
import kr.jackson.manager.ServiceChannelManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JacksonApplicationTests {

    @Autowired
    ServiceChannelManager serviceChannelManager;

    @Test
    void contextLoads() {
    }

    @Test
    void txTest(){
        Order order = Order.builder().build();

        serviceChannelManager.test(order);

        System.out.println("TEST ENDS");
    }

}
