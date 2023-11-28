package uz.pdp.scope;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy
public class ViewSingletonBean {
    public ViewSingletonBean() {
        System.out.println("[ " + ViewSingletonBean.class.getSimpleName() + " ] constructor.");
    }
}
