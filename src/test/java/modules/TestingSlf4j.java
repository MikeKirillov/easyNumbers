package modules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestingSlf4j {
    private final static Logger log = LoggerFactory.getLogger(TestingSlf4j.class);

    public static void main(String[] args) {
        log.debug("Debug log message");
        log.info("Info log message");
        log.error("Error log message");
    }
}
