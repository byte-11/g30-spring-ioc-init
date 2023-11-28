package uz.pdp.qulifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceC {
    private Service service;

    public Service getService() {
        return service;
    }

    @Autowired
    public void setService(@Qualifier("serviceA") Service service) {
        this.service = service;
    }
}
