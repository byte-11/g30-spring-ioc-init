package uz.pdp.propertysource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceExample {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        DatabaseConfig databaseConfig = context.getBean(DatabaseConfig.class);
        System.out.println(databaseConfig);
    }
}
