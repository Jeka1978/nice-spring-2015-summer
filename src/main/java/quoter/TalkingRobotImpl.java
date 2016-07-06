package quoter;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Jeka on 06/07/2016.
 */
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoters;



    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}