package quoter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/07/2016.
 */
@Component
public class Trumpeldor implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Good to die for our country");
    }
}
