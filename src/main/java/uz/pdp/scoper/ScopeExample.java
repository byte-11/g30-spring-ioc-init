package uz.pdp.scoper;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        for (int i = 0; i < 10; i++) {
            ViewSingletonBean bean = context.getBean(ViewSingletonBean.class);
            System.out.println(System.identityHashCode(bean));
        }

        System.out.println("-------------------------------------------");

        for (int i = 0; i < 10; i++) {
            ViewProtoBean bean = context.getBean(ViewProtoBean.class);
            System.out.println(System.identityHashCode(bean));
        }

    }
}
