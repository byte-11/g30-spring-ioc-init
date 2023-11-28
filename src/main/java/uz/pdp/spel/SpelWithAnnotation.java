package uz.pdp.spel;


import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class SpelWithAnnotation {
    @Value("#{1 == 1}")
    private boolean isTrue;

    @Value("#{perform.random()}")
    private int random;
}
