package step20;

import com.google.inject.Inject;

/**
 * Created by ibenian on 16/5/20.
 */
public class Greeter {
    private final Displayer displayer;

    // No need to put an @Inject annotation because this class is bound through a specific constructor
    public Greeter(Displayer displayer) {
        this.displayer = displayer;
    }

    void sayHello() {
        displayer.display("Hello world");
    }
}
