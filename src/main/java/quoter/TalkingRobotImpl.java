package quoter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jeka on 06/07/2016.
 */
@Component
public class TalkingRobotImpl implements TalkingRobot {

    private List<Quoter> quoters =
            new ArrayList<>(Collections.singletonList(
                    (Quoter) () ->
                            System.out.println(
                                    "this is default quote")));

    @Autowired(required = false)
    @Film
    public void setQuoters(List<Quoter> quoters) {
        for (Quoter quoter : quoters) {
            this.quoters.add(quoter);
        }
    }

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}
