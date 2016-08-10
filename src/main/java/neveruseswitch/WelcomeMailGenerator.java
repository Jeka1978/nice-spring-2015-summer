package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/08/2016.
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "Welcome new client";
    }

    @Override
    public int code() {
        return 1;
    }
}
