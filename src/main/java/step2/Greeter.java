package step2;

import com.google.inject.Inject;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private @Inject Displayer displayer;

    void sayHello() {
        displayer.display("Hello world");
    }
}
