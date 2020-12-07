package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class Java implements Course {
    private ExtraSessions extraSessions;
    @Value("JD1")
    private String Batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "extraSessions=" + extraSessions +
                ", Batch='" + Batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Teaching java hours: " + (30 + extraSessions.getHours()));
    }
}
