package app;

import app.interfaces.Course;
import app.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("javaClass", Course.class);
        course.getTeachingHourse();
        course = container.getBean("seleniumClass", Course.class);
        course.getTeachingHourse();
    }
}
