package step3;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by ibenian on 3/10/17.
 *
 * Method injection
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector()
            .getInstance(Greeter.class)
            .sayHello();
    }
}
