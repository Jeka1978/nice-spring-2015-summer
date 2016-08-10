package quoter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 06/07/2016.
 */
@Component
public class ShakespearQuoter implements Quoter {
    @InjectRandomInt(min = 5, max = 8)
    private int repeat;

    @Value("${shake}")
    private String message;

    @Override
    @Deprecated
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
