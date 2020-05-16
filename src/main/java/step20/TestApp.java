package step20;

import com.google.inject.Guice;

/**
 * Created by ibenian on 16/5/20.
 *
 * Modules and binding interfaces to classes.
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
