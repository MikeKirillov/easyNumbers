package modules;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingLogback {
    private static final Logger log = (Logger) LoggerFactory.getLogger(TestingLogback.class);

    public static void main(String[] args) {
        log.info("Test log from {}", TestingLogback.class.getSimpleName());
    }
}
