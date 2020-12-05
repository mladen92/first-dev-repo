package services;

import interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching Selenium 25 hr");

    }
}
