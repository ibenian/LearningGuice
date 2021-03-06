package step7;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Using annotatedWith to bind to implementations selectively.
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
