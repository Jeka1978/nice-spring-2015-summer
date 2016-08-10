package neveruseswitch;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/08/2016.
 */
@Component
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "happy birthday";
    }

    @Override
    public int code() {
        return 3;
    }
}
