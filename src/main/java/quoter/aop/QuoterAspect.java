package quoter.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/08/2016.
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* quoter..*.say*(..))")
    public void printAuthor(JoinPoint jp){
        System.out.println("This is quote of "+jp.getTarget().getClass().getSimpleName());
    }













}
