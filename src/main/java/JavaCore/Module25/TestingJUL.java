package JavaCore.Module25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestingJUL {
    public static final Logger logger = Logger.getLogger(TestingJUL.class.getName());

    public static void main(String[] args) {

/*
         throwing message using JIL logger
*/
        logger.log(Level.INFO, "Hello world! (using logger.log > Level.INFO)");
        logger.info("Hello world! (using logger.info)");

/*
         throwing exception with logger message
*/
        try {
            int x = 25 / 0;
        } catch (Exception e) {
            logger.log(Level.WARNING, "error message", e);
        }

/*
         throwing logger message at file
*/
//        LogManager.getLogManager().readConfiguration(TestingJUL.class.getResourceAsStream("JULconfig.txt"));
        logger.setLevel(Level.ALL);
        logger.info("initializing - trying to load configuration file...");

        Properties preferences = new Properties();
        try {
            FileInputStream configFile = new FileInputStream("/Users/michaelkirillov/IdeaProjects/easyNumbers/" +
                    "different files/JULconfig.txt");
            preferences.load(configFile);
            LogManager.getLogManager().readConfiguration(configFile);
        } catch (Exception e) {
            logger.log(Level.WARNING, "error message", e);
        }
    }
}