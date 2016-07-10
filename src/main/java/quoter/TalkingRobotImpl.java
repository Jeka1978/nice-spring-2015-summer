package quoter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 06/07/2016.
 */
@Component
public class TalkingRobotImpl implements TalkingRobot {
    @Autowired(required = false)
    private List<Quoter> quoters =
            Arrays.asList((Quoter) () -> System.out.println("This is default Quote"));



    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
