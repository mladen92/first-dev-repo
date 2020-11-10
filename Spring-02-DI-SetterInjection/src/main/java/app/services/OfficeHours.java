package app.services;

import app.interfaces.ExtraSessionInterface;

public class OfficeHours implements ExtraSessionInterface {
    @Override
    public int getHours() {
        return 5;
    }
}
