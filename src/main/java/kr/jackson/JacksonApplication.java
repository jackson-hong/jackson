package kr.jackson;

import kr.jackson.common.filter.MDCFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JacksonApplication {
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
