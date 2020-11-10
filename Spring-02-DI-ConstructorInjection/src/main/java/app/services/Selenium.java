package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Selenium implements Course {
    ExtraSessionInterface extrSessions;

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly teaching hours: " + (15 + extrSessions.getHours()));

    }
}
