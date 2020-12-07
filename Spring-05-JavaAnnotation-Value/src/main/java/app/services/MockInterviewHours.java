package app.services;

import app.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 9;
    }
}
