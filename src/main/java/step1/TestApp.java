package step1;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by ibenian on 3/10/17.
 *
 * Simple class instantiation with no injection.
 *
 */
public class TestApp {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        Greeter greeter = injector.getInstance(Greeter.class);
        greeter.sayHello();
    }
}
