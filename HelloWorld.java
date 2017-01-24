import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class HelloWorld{
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    public static void main(String[] args) {
        logger.debug("debug:Hello, World!");
        logger.info("info:Hello, World!");
        logger.warn("warn: Hello, World!");
        logger.error("error:Hello, World!");
    }
}
