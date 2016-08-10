package qualifiers;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static qualifiers.DBType.ORACLE;

/**
 * Created by Jeka on 10/08/2016.
 */
@Service
public class BackupService {

    @NiceRepo(ORACLE)
    private NiceDao niceDao;

    @SneakyThrows
    @Scheduled(cron = "1/3 * * * * ?")
    public void doBackup() {
        System.out.println("backuping...");
        niceDao.save();
    }
}
