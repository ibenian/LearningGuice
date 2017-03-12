package step8;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private final Displayer displayer;

    @Inject
    Greeter(@Named("for times square") Displayer displayer) {
        this.displayer = displayer;
    }

    void sayHello() {
        displayer.display("Hello world");
    }
}
