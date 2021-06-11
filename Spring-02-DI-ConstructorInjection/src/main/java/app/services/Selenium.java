package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import lombok.AllArgsConstructor;


public class Selenium implements Course {
    ExtraSessionInterface extraSession;
    final int hours = 15;

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly Selenium teaching hours: " + hours);
        System.out.println("Weekly Selenium extra session  hours: " + extraSession.getHours());
    }

    public Selenium(ExtraSessionInterface extraSession) {
        this.extraSession = extraSession;
    }
}
