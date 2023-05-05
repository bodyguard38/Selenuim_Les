package Day13;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class C03_Log4j {

    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        Logger logger = Logger.getLogger(C03_Log4j.class);

        logger.trace("This is a trace message"); // trace
        logger.debug("This is a debug message"); // debug
        logger.info("This is an info message"); // info
        logger.warn("This is a warning message"); // warn
        logger.error("This is an error message"); // error
        logger.fatal("This is a fatal message"); // fatal

    }
}
