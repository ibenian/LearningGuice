package step17;

import com.google.inject.Inject;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private final Displayer displayer;

    @Inject
    Greeter(Displayer displayer) {
        this.displayer = displayer;
    }

    void sayHello() {
        displayer.display("Hello world");
    }
}
