package step18;

import com.google.inject.Guice;

/**
 * Created by ibenian on 3/10/17.
 *
 * Binding to provider using @ProvidedBy
 *
 */
public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector()          // No need for a module
            .getInstance(Greeter.class)
            .sayHello();
    }
}
