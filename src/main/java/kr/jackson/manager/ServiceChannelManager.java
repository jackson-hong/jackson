package kr.jackson.manager;

import kr.jackson.controller.param.JacksonRequest;
import kr.jackson.controller.payload.BasePayload;
import kr.jackson.domain.Order;
import kr.jackson.service.order.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Component
@RequiredArgsConstructor
public class ServiceChannelManager {

    private final OrderService orderService;

    public BasePayload findJackson(JacksonRequest request){
        return null;
    };

    @Transactional
    public void test(Order order){
        orderService.save(order);
        System.out.println("TRANSACTIONAL ENDS");
    }
}
