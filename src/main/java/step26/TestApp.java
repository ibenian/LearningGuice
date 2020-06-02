package step26;

import com.google.inject.Guice;
import static helper.BindingPrinter.printBindings;

public class TestApp {

    public static void main(String[] args) {
        printBindings(Guice.createInjector(new DisplayModule()))
            .getInstance(Greeter.class)
            .sayHello();
    }
}
