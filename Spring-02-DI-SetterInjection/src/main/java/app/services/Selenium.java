package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
public class Selenium implements Course {
    private ExtraSessionInterface extraSessions;

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly selenium teaching hours: " + (15 + extraSessions.getHours()));

    }
}
