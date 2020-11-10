package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
public class Java implements Course {
    private ExtraSessionInterface extraSessions;
    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly java teaching hours: " + (20 + extraSessions.getHours()));
    }
}

