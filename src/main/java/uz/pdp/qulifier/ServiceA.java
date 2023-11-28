package uz.pdp.qulifier;

import org.springframework.stereotype.Component;

@Component
public class ServiceA implements Service{
    @Override
    public void serve() {
        System.out.println("[ServiceA]");
    }
}
