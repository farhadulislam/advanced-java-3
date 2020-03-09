package demonstration2;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerDemo {

    static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String [] args){

        logger.log(Level.INFO, "My first log message");
        logger.log(Level.INFO, "another message");
    }
}
