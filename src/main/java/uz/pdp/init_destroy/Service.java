package uz.pdp.init_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Service {

    public Service() {
        System.out.println("[ " + Service.class.getSimpleName() + " ] constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("[ " + Service.class.getSimpleName() + " ] init() method called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[ " + Service.class.getSimpleName() + " ] destroy() method called");
    }
}
