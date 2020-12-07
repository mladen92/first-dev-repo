package app.services;

import app.interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Create part time mentor account !!! ");
    }
}
