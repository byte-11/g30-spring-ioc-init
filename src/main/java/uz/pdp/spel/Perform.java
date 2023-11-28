package uz.pdp.spel;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Perform {
    public int random() {
        Random random = new Random();
        return random.nextInt();
    }
}
