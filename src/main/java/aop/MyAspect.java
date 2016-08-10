package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/08/2016.
 */
@Component
@Aspect
public class MyAspect {

    @After("execution(* quoter..*Service.*(..))")
    public void afterServicesMethods(JoinPoint jp){
        System.out.println("I know this was method of some service");
    }

    @Before("@annotation(Deprecated)")
    public void handleDeprecatedMethods(){
        System.out.println("Be ware!!! you are using deprecated method");
    }

}
