package neveruseswitch;

import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/08/2016.
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml() {
        return "don't call us we call you";
    }

    @Override
    public int code() {
        return 2;
    }
}
