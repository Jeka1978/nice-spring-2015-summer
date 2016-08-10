package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Jeka on 10/08/2016.
 */

@Service
public class MailSender {

    @Autowired
    private Map<String,MailGenerator> map;

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        String mailCode = String.valueOf(DBUtils.getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new RuntimeException("mail code " + mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml();
        send(html);

    }

    private void send(String html) {
        System.out.println("sending... "+html);
    }
}




