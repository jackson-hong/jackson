package kr.jackson.domain;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
//    @Disabled 필요하지 않은 경우 Disabled 어노테이션으로 구동되지 않게 할 수 있다
    void create(){
        // 기존에 public만 가능했지만
        // 5.0 부터는 리플렉션을 통해 상관없이 만들었음
        Order order = new Order();
        assertNotNull(order);
    }

    @BeforeAll //이 안에 있는 여러 테스트가 모두 실행이 될 때 딱 한번 전에 실행이 됨
    static void beforeAll(){ //static void로만 구현할 수 있다
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @AfterEach
    void afterEach(){
        System.out.println("after each");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before each");
    }
}