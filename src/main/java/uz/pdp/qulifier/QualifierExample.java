package uz.pdp.qulifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(BeanConfig.class);
        ServiceC serviceC = context.getBean(ServiceC.class);
        serviceC.getService().serve();
    }
}
