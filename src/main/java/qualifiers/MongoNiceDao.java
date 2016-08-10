package qualifiers;

import org.springframework.stereotype.Repository;

/**
 * Created by Jeka on 10/08/2016.
 */
@Repository
public class MongoNiceDao implements NiceDao {
    @Override
    public void save() {
        System.out.println("saving to mongo");

    }
}
