package uz.pdp.scope;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy(value = false)
public class ViewProtoBean {
    public ViewProtoBean() {
        System.out.println("[ " + ViewProtoBean.class.getSimpleName() + " ] constructor.");
    }
}
