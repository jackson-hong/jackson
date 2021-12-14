package kr.jackson;

<<<<<<< HEAD
import ch.qos.logback.core.net.SyslogOutputStream;
import kr.jackson.domain.Order;
import kr.jackson.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Properties;
=======
import kr.jackson.common.filter.MDCFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
>>>>>>> 909238b4a4ac42403951ce1b64b62145bf17fc3b

@SpringBootApplication
@EnableSwagger2
public class JacksonApplication {
<<<<<<< HEAD


    public static void main(String[] args) {
//        SpringApplication.run(JacksonApplication.class, args);
    }

}
=======
    public static void main(String[] args) {
        SpringApplication.run(JacksonApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean setFilterRegistration(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new MDCFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
>>>>>>> 909238b4a4ac42403951ce1b64b62145bf17fc3b
