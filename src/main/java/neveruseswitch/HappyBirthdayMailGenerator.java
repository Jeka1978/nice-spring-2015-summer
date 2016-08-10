package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/08/2016.
 */
@Component("2")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "happy birthday";
    }
}
