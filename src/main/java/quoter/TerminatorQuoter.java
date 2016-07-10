package quoter;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by Jeka on 06/07/2016.
 */

@Transactional
@Benchmark
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll() {
        new Thread(() -> System.out.println("you are terminated")).start();

    }
}













