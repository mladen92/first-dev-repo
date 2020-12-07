package app.services;

import app.interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Create Full Time mentor account !!!");
    }
}
