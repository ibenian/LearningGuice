package step22;

import com.google.inject.Inject;

public class Greeter {
    private final DisplayerBase displayer;

    @Inject
    Greeter(DisplayerBase displayer) {
        this.displayer = displayer;
    }

    void sayHello() {
        displayer.display("Hello world");
    }
}
