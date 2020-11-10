package app.services;

import app.interfaces.Course;
import lombok.Setter;

public class Selenium implements Course {

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly selenium teaching hours: " + 15);

    }
}
