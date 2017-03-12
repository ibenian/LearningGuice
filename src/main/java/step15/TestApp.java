package step15;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Binding to an existing instance
 * or binging to singleton using toInstance().
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
