package quoter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by Jeka on 06/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("quoter");
    }
}
