package profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Jeka on 10/08/2016.
 */
@Service
public class MyService {
    @Autowired
    private Dao dao;

    @PostConstruct
    public void doThing() {
        dao.save();
    }
}
