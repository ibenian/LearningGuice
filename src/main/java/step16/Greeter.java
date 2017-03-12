package step16;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private final Provider<Displayer> lazyDisplayer;

    @Inject
    Greeter(Provider<Displayer> lazyDisplayer) { // A free provider is injected automatically
        this.lazyDisplayer = lazyDisplayer;   // Will be instantiated when get() is called
    }

    void sayHello() {
        lazyDisplayer.get()
                .display("Hello world"); // Instantiated when get() is called
    }
}
