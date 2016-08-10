package profiles;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Jeka on 10/08/2016.
 */
public class NonWindowsDetector implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String os = System.getenv().get("OS").toLowerCase();
        return os.contains("windows");
    }

}
