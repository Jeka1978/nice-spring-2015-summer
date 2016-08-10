package screenSaver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * Created by Jeka on 10/08/2016.
 */
@Configuration
public class ScreenSaverJavaConfig {

    @Value("${JAVA_HOME}")
    private String javaHome;


    @Bean
    public FlyingFrame flyingFrame(){
        return new FlyingFrame() {
            @Override
            protected Color getColorBean() {
                return color();
            }
        };
    }

    @Bean
    @Scope(value = "prototype")
    public Color color(){
        if (javaHome == null) {
            return Color.BLACK;
        }
        Random random = new Random();
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        return color;
    }
}
