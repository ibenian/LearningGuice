package step9;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Binding a constant value for an annotated injection.
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
