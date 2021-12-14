package kr.jackson;

import ch.qos.logback.core.net.SyslogOutputStream;
import kr.jackson.domain.Order;
import kr.jackson.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Properties;

@SpringBootApplication
@EnableSwagger2
public class JacksonApplication {


    public static void main(String[] args) {
//        SpringApplication.run(JacksonApplication.class, args);
    }

}