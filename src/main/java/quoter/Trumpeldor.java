package quoter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Jeka on 10/07/2016.
 */
@Component
@Qualifier("history")
public class Trumpeldor implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Good to die for our country");
    }
}
