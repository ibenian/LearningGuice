package step2;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by ibenian on 3/10/17.
 *
 * Field injection
 *
 */
public class TestApp {
    /*
    public static void main2(String[] args) {
        Injector injector = Guice.createInjector();
        Greeter greeter = injector.getInstance(Greeter.class);
        greeter.sayHello();
    }*/

    public static void main(String[] args) {
        Guice.createInjector()
            .getInstance(Greeter.class)
            .sayHello();
    }
}
