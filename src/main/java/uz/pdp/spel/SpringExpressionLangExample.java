package uz.pdp.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@ComponentScan
public class SpringExpressionLangExample {
    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        String value = parser.parseExpression("'Toy' + 'Bola'").getValue(String.class);
//        System.out.println(value);
//        System.out.println(parser.parseExpression("1 + 2").getValue(Integer.class));
//        System.out.println(parser.parseExpression("1 - 2").getValue(Integer.class));
//        System.out.println(parser.parseExpression("1 * 2").getValue(Integer.class));
//        System.out.println(parser.parseExpression("1f / 2f").getValue(Float.class));
//
//        System.out.println(parser.parseExpression("5 == 5").getValue(Boolean.class));
//        System.out.println(parser.parseExpression("5 < 5").getValue(Boolean.class));
//
//        System.out.println(parser.parseExpression("new uz.pdp.spel.Perform().random()").getValue(Integer.class));

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringExpressionLangExample.class);
        SpelWithAnnotation bean = context.getBean(SpelWithAnnotation.class);
        System.out.println(bean);

    }
}
