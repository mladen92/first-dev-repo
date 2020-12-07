package app.services;

import app.interfaces.Course;
import org.springframework.stereotype.Component;


public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Teaching selenium 15 hours");
    }
}
