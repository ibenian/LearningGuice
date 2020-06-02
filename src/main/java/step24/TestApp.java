package step24;

import com.google.inject.Guice;
import static helper.BindingPrinter.printBindings;

public class TestApp {

    public static void main(String[] args) {
        printBindings(Guice.createInjector())
            .getInstance(Greeter.class)
            .sayHello();
    }
}
