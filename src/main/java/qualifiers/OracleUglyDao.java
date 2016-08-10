package qualifiers;

import org.springframework.stereotype.Repository;

/**
 * Created by Jeka on 10/08/2016.
 */
@Oracle
public class OracleUglyDao implements NiceDao {
    @Override
    public void save() throws InterruptedException {
        Thread.sleep(50);
        System.out.println("saving to oracle...");
    }
}
