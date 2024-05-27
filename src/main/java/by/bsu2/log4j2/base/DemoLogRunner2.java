package by.bsu2.log4j2.base;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLogRunner2 {
    static Logger logger = LogManager.getLogger(Generation.class);
    static Logger rootLogger = LogManager.getRootLogger();
    public static void main(String[] args) {
        Generation generation = new Generation();
        logger.log(Level.INFO, "Logger ", () -> generation.generateInt());
        rootLogger.log(Level.INFO, "Root Logger Int" ,() -> generation.generateInt());
        rootLogger.log(Level.INFO, "Root Logger Str" ,() -> generation.toString());
    }
}
