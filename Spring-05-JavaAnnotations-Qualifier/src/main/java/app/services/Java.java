package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    //  @Autowired
    //  @Qualifier("mockInterviewHours")
    private ExtraSessions extraSessions;

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("weekly teaching Java: " + (30 + extraSessions.getHours()));
    }
}
