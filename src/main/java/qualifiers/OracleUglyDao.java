package qualifiers;

import org.springframework.stereotype.Repository;

import static qualifiers.DBType.ORACLE;

/**
 * Created by Jeka on 10/08/2016.
 */
@NiceRepo(ORACLE)
public class OracleUglyDao implements NiceDao {
    @Override
    public void save() throws InterruptedException {
        Thread.sleep(50);
        System.out.println("saving to oracle...");
    }
}
