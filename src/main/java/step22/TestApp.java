package step22;

import com.google.inject.Guice;

/**
 *
 * Modules and binding interfaces to classes.
 *
 */
public class TestApp {

    public static void main(String[] args) {
        // Without module config to override bindings
        Guice.createInjector()
            .getInstance(Greeter.class)  // This will instantiate DisplayerBase (the default binding)
            .sayHello();

        // With module config to override bindings
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)  // This will instantiate FancyDisplayer (bindings overriden in the module config)
            .sayHello();
    }
}
