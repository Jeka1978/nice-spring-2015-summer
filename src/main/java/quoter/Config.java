package quoter;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Jeka on 10/08/2016.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:application.properties")
public class Config {
}
