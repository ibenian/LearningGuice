package step16;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Lazy instantiation via free providers.
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
