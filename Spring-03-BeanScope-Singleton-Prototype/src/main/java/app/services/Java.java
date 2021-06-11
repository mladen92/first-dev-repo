package app.services;

import app.interfaces.Course;


public class Java implements Course {
    @Override
    public void getTeachingHourse() {
        System.out.println("Weekly java teaching hours: " + 20);
    }
}

