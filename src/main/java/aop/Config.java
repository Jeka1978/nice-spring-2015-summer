package aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Jeka on 17/08/2016.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:mails.properties")
public class Config {
}
