package step25;

import com.google.inject.Guice;

public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getProvider(GreeterFactory.class)
            .get().create("Ibe")  // Alternatively, this factory can be injected on some other object
            .sayHello();
    }
}
