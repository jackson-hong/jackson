package kr.jackson.service.order;

import kr.jackson.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final PlatformTransactionManager manager;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Order order){
        orderRepository.save(order);
        System.out.println("INNER TRANS ENDS");
//        TransactionStatus status = manager.getTransaction();
    }

}
