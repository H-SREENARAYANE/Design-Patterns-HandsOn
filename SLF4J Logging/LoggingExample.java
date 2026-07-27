import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    static Logger log = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        log.warn("Warning Message");

        log.error("Error Message");
    }
}