package step25;

import com.google.inject.Guice;
import static helper.BindingPrinter.printBindings;

public class TestApp {

    public static void main(String[] args) {
        printBindings(Guice.createInjector(new DisplayModule()))
            .getProvider(GreeterFactory.class)
            .get().create("Ibe")  // Alternatively, this factory can be injected on some other object
            .sayHello();
    }
}
