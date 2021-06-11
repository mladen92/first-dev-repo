import app.interfaces.Course;
import app.interfaces.ExtraSessionInterface;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassApp {

    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course = container.getBean("javaClass", Course.class);
        Course course1 = (Course) container.getBean("seleniumClass");
        course.getTeachingHourse();
        course1.getTeachingHourse();


    }
}
