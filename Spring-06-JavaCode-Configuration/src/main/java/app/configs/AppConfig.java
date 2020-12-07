package app.configs;

import app.services.Java;
import app.services.OfficeHours;
import app.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("app")
@PropertySource("classpath:aplication.properties")

public class AppConfig {
    @Bean
    public Java java() {
        return new Java(officeHours());
    }
    @Bean
    public Selenium selenium() {
        return new Selenium();
    }
    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

}
