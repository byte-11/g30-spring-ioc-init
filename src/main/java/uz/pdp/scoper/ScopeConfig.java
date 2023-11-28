package uz.pdp.scoper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {

    @Bean
    @Lazy
    @Scope("singleton")
    public ViewSingletonBean viewBean() {
        return new ViewSingletonBean();
    }

    @Bean
    @Scope("prototype")
    public ViewProtoBean viewProtoBean(){
        return new ViewProtoBean();
    }
}
