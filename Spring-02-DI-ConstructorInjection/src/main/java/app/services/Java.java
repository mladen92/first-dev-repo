package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Java implements Course {
    ExtraSessionInterface extraSession;
    final int hours = 20;

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly Java teaching hours: " + hours);
        System.out.println("Weekly Java extra session  hours: " + extraSession.getHours());

    }
}

