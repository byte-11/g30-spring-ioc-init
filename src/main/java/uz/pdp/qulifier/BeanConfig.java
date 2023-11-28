package uz.pdp.qulifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanConfig {
    @Bean
    public ServiceA serviceA(){
        return new ServiceA();
    }

    @Bean
    public ServiceB serviceB(){
        return new ServiceB();
    }

    @Bean
    public ServiceC serviceC(){
        return new ServiceC();
    }
}
