package step23;

import com.google.inject.Guice;

public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector(new DisplayModule())
            .getInstance(Greeter.class)
            .sayHello("kay");
    }
}
