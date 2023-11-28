package uz.pdp.scope.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.scope.ScopeExample;
import uz.pdp.scope.ViewProtoBean;
import uz.pdp.scope.ViewSingletonBean;

public class LazyInitExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeExample.class);
//        ViewSingletonBean viewSingletonBean = context.getBean(ViewSingletonBean.class);
//        ViewProtoBean viewProtoBean = context.getBean(ViewProtoBean.class);

    }
}
