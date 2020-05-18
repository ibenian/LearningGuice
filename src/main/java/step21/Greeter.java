package step21;

import com.google.inject.Inject;

/**
 * Created by ibenian on 17/5/20.
 */
public class Greeter {
    private final Displayer displayer;

    @Inject
    public Greeter(Displayer displayer) {
        this.displayer = displayer;
    }

    void sayHello() {
        displayer.display("Hello world");
    }
}
