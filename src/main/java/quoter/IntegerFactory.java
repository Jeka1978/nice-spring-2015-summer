package quoter;

import org.springframework.beans.factory.FactoryBean;

import java.util.Random;

/**
 * Created by Jeka on 10/07/2016.
 */
public class IntegerFactory implements FactoryBean<Integer> {
    @Override
    public Integer getObject() throws Exception {
        Random random = new Random();
        return random.nextInt(100);
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
