package uz.pdp.qulifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class QualifierExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(QualifierExample.class);
        ServiceC serviceC = context.getBean(ServiceC.class);
        serviceC.getService().serve();
    }
}
