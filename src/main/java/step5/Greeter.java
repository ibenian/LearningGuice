package step5;

import com.google.inject.Inject;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private final Displayer displayer;
    private final Person person;

    @Inject
    Greeter(Displayer displayer, Person person) {
        this.displayer = displayer;
        this.person = person;
    }

    void sayHello() {
        displayer.display("Hello " + person);
    }
}
