package uz.pdp.init_destroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class InitDestroyExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Service service = context.getBean(Service.class);
        context.close();
    }
}
