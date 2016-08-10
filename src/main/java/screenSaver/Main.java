package screenSaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jeka on 10/08/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("screenSaver");
        while (true) {
            context.getBean(FlyingFrame.class).fly();
            Thread.sleep(100);
        }

    }
}
