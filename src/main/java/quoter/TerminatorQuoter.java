package quoter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 06/07/2016.
 */

@Transactional
@Benchmark
@Component
@Film
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages, @Value("${JAVA_HOME}") String java) {
        System.out.println(java);
        this.messages = Arrays.asList(messages);
    }

    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll() {
        new Thread(() -> System.out.println("you are terminated")).start();

    }
}













