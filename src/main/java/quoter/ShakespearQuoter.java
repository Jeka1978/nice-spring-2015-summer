package quoter;

/**
 * Created by Jeka on 06/07/2016.
 */
public class ShakespearQuoter implements Quoter {
    @InjectRandomInt(min = 5, max = 8)
    private int repeat;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
