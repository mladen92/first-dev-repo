package com.app;

import com.app.entity.Car;
import com.app.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrmconfigApplication {
    @Autowired
    CarRepository carRepository;

    public static void main(String[] args) {


        SpringApplication.run(OrmconfigApplication.class, args);
    }

    @PostConstruct
    public void dataInit() {
        Car c1 = new Car("BMW", "M5");
        Car c2 = new Car("Audi", "a4");
        Car c3 = new Car("Golf", "2");
        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }
}
