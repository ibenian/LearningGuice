package step10;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Binding a provider class that news up instances on-demand.
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
