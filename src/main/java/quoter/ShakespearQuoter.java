package quoter;

/**
 * Created by Jeka on 06/07/2016.
 */
public class ShakespearQuoter implements Quoter {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
