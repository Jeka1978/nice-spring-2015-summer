package neveruseswitch;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Jeka on 10/08/2016.
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages = "neveruseswitch")
public class Config {
}
