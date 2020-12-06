package services;

import interfaces.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired
    private OfficeHours officeHours;

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
        System.out.println("weekly teaching Java: " + (30 + officeHours.getHours()));
    }
}
