package aop;

import aop.business.MyService;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jeka on 17/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("aop");
        try {
            context.getBean(MyService.class).work();
        } catch (Exception e) {
            System.out.println("Problem");

        }

    }
}
