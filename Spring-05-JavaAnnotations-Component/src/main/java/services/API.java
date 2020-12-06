package services;

import interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly 10 api teching hours");
    }
}
