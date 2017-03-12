package step5;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Injecting multiple constructor arguments
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector()
            .getInstance(Greeter.class)
            .sayHello();
    }
}
