package neveruseswitch;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Jeka on 10/08/2016.
 */
@EnableScheduling
@Service
public class MailSender {

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();

    }
}
