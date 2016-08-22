package aop.business;

import org.springframework.stereotype.Repository;

/**
 * Created by Jeka on 17/08/2016.
 */
@Repository
public class MyDao {

    public void work() {
        save();
    }

    public void save() {
        System.out.println("saving..");
        throw new DBException("sql sucks!");
    }
}
