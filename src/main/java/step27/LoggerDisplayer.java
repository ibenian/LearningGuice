package step27;

// import java.util.logging.Logger;
// import com.google.inject.Inject;

public class LoggerDisplayer implements Displayer {
    // @Inject
    // private Logger logger;  // Unfortunately this wouldn't be injected becasue the provider maually created this.

    public void display(String s) {
        System.out.println(String.format("Logger Displayer: %s", s));
        // logger.info(String.format("Logger Displayer: %s", s));
    }
}
