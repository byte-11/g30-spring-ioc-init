package uz.pdp.scoper.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.scoper.ScopeConfig;
import uz.pdp.scoper.ViewSingletonBean;

public class LazyInitExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

//        ViewSingletonBean bean = context.getBean(ViewSingletonBean.class);
    }
}
