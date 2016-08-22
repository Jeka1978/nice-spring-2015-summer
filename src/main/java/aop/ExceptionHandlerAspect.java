package aop;

import aop.business.DBException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by Jeka on 17/08/2016.
 */
@Component
@Aspect
public class ExceptionHandlerAspect {

    @Value("${dbaMails}")
    private String[] mails;

    private Map<DBException, Void> map = new WeakHashMap<>();

    @Pointcut("execution(* aop.business..*.*(..))")
    public void allBusinessMethods(){}

    @AfterThrowing(value = "allBusinessMethods()",throwing = "ex")
    public void handleDBExceptions(DBException ex) {
        if (!map.containsKey(ex)) {
            map.put(ex, null);
            for (String mail : mails) {
                System.out.println("sending mail to "+mail+": "+ex.getMessage());
            }
        }

    }


}





