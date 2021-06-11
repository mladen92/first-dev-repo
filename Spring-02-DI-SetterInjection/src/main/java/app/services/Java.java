package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;


public class Java implements Course {
    private ExtraSessionInterface extraSession;

    public ExtraSessionInterface getExtraSession() {
        return extraSession;
    }

    public void setExtraSession(ExtraSessionInterface extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly java teaching hours: " + (20 + extraSession.getHours()));
    }
}

