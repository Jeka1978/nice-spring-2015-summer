package quoter.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

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

    @Around("@annotation(Deprecated)")
    public void handleDeprecated(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("This is deprecated method, it will not be invoked");
        pjp.proceed();
        System.out.println("Ok I'm invoking it for the last time");
    }

   /* @AfterThrowing(value = "@annotation(Deprecated)",throwing = "ex")
    public void handleEx(FileNotFoundException ex) {

    }*/













}
