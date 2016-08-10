package qualifiers;

import static qualifiers.DBType.MONGO;

/**
 * Created by Jeka on 10/08/2016.
 */
@NiceRepo(MONGO)
public class MongoNiceDao implements NiceDao {
    @Override
    public void save() {
        System.out.println("saving to mongo");

    }
}
