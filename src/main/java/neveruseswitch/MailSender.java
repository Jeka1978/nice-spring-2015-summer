package neveruseswitch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jeka on 10/08/2016.
 */

@Component
public class MailSender {

    private Map<Integer,MailGenerator> map = new HashMap<>();

    @Autowired
    public void initMap(List<MailGenerator> list) {
        for (MailGenerator mailGenerator : list) {
            if (map.containsKey(mailGenerator.code())) {
                throw new RuntimeException("mailcode " + mailGenerator.code() + " already in use");
            }
            map.put(mailGenerator.code(), mailGenerator);
        }
    }

    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail() {
        int mailCode = DBUtils.getMailCode();
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




