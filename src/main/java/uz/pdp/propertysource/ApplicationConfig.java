package uz.pdp.propertysource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Bean
    public DatabaseConfig databaseConfig() {
        return new DatabaseConfig();
    }

}
