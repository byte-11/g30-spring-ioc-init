package uz.pdp.qulifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class QualifierExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(QualifierExample.class);
        HomeController controller = context.getBean(HomeController.class);
        controller.getService().serve();
    }
}
