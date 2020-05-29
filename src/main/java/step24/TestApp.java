package step24;

import com.google.inject.Guice;

public class TestApp {

    public static void main(String[] args) {
        Guice.createInjector()
            .getInstance(Greeter.class)
            .sayHello();
    }
}
