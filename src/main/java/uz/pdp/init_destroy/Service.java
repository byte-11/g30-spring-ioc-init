package uz.pdp.init_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Service implements InitializingBean, DisposableBean {

    public Service() {
        System.out.println("[ " + Service.class.getSimpleName() + " ] constructor called");
    }

    public void init() {
        System.out.println("[ " + Service.class.getSimpleName() + " ] init() method called");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[ " + Service.class.getSimpleName() + " ] destroy() method called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[ " + Service.class.getSimpleName() + " ] afterPropertiesSet() method called");
    }


}
