package profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * Created by Jeka on 10/08/2016.
 */
@Repository
@Prod
public class DaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("Saving to PRODUCTION");
    }
}
