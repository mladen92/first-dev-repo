package app.services;

import app.interfaces.Course;
import app.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

@Component
public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Teaching java hours: " + 30 );
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("executing post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Execute Pre Destroy");
    }
}
