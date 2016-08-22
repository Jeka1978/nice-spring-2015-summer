package aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jeka on 17/08/2016.
 */
@Service
public class MyService {
    @Autowired
    private MyDao dao;

    public void work() {
        dao.work();
    }
}
