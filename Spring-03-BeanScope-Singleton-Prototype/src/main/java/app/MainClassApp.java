package app;

import app.interfaces.Course;
import app.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("javaClass", Java.class);
        Course course2 = container.getBean("javaClass", Java.class);

        System.out.println("Pointing to same Object: " + (course1 == course2));
        System.out.println("Memory location course 1: " + course1);
        System.out.println("Memory location course 2: " + course2);
    }
}
