package app.services;

import app.interfaces.Course;


public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly java teaching hours: " + 20);
    }

    public void myInitMethod() {
        System.out.println("Executing init method");
    }

    public void myDestroyMethod() {
        System.out.println("Executing destroy method");
    }

}
