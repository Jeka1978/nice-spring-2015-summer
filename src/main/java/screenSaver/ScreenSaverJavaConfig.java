package screenSaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.awt.*;
import java.util.Random;

/**
 * Created by Jeka on 10/08/2016.
 */
@Configuration
public class ScreenSaverJavaConfig {

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
        Random random = new Random();
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        return color;
    }
}
