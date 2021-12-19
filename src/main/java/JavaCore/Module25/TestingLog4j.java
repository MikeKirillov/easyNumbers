package JavaCore.Module25;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestingLog4j {
    private static final Logger log = LogManager.getLogger(TestingLog4j.class);// works only with org.apache.logging.log4j.Logger
//    private static final Logger log = Logger.getLogger(TestingLog4j.class.getName());// works without org.apache.logging.log4j.Logger

    public static void main(String[] args) {
        log.info("Some info message!");
        log.error("Error message!");
    }
}
