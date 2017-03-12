package step9;

import com.google.inject.Inject;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private final Displayer displayer;
    private final String msg;

    @Inject
    Greeter(Displayer displayer, @MessageForDisplay String msg) {
        this.displayer = displayer;
        this.msg = msg;
    }

    void sayHello() {
        displayer.display(msg);
    }
}
