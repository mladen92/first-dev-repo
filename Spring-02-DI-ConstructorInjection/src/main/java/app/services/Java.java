package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Java implements Course {
    ExtraSessionInterface extrSessions;
    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly teaching hours: " + (20 + extrSessions.getHours()));
    }
}

