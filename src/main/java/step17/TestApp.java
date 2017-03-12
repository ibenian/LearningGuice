package step17;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Binding to implementation using @ImplementedBy
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector()      // No need for module
            .getInstance(Greeter.class)
            .sayHello();
    }
}
