package step28;

import com.google.inject.Guice;
import com.google.inject.Inject;

import static helper.BindingPrinter.printBindings;

public class TestApp {
    @Inject
    private GreeterFactory greeterFactory;

    @Inject 
    private Greeter greeter;

    public void run() {
        // Create using injected factory
        greeterFactory.create("Ibe").sayHello();
        // Use auto-injeted greeter instance provided from the module.
        greeter.sayHello();
    }

    public static void main(String[] args) {
        printBindings(Guice.createInjector(new DisplayModule()))
            .getInstance(TestApp.class)  // This will inject all fields
            .run();
    }
}
