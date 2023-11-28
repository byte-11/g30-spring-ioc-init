package uz.pdp.qulifier;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
@Getter
public class HomeController {
    private final Service service;

    public HomeController(@Qualifier("toybolaService") Service service) {
        this.service = service;
    }
}
