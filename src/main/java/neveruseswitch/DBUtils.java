package neveruseswitch;

import java.util.Random;

/**
 * Created by Jeka on 10/08/2016.
 */
public class DBUtils {
    public static int getMailCode() {
        Random random = new Random();
        return random.nextInt(3)+1;
    }
}
