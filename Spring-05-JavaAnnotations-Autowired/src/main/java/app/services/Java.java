package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired
    private ExtraSessions extraSessions;

    /*
        @Autowired
        public Java(OfficeHours officeHours) {
            this.officeHours = officeHours;
        }
    */

    /*
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    */


    public void getTeachingHours() {
        System.out.println("weekly teaching Java: " + (30 + extraSessions.getHours()));
    }
}
