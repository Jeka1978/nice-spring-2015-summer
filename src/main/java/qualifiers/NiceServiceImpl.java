package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Created by Jeka on 10/08/2016.
 */
@Service
@EnableScheduling
public class NiceServiceImpl implements NiceService {
    @Mongo
    private NiceDao niceDao;

    @Override
    @Scheduled(cron = "1/1 * * * * ?")
    public void doWork() throws InterruptedException {
        System.out.println("working...");
        niceDao.save();
    }
}
