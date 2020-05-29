package step24;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Greeter {
    private final Provider<Displayer> displayerProvider;

    // Inject a provider of Displayer instead of an instance of Displayer so we can call get() multiple times
    @Inject
    Greeter(Provider<Displayer> displayerProvider) {
        this.displayerProvider = displayerProvider;
    }

    void sayHello() {
        displayerProvider.get()  // Instantiate on-demand
            .display("Hello world 1");
        displayerProvider.get()  // Instantiate again on-demand
            .display("Hello world 2");
    }
}
