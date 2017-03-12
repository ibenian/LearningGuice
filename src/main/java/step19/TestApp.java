package step19;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Binding to provider method (factory method) using @Provides
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
