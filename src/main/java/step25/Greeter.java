package step25;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class Greeter {
    private final Displayer displayer;
    private final String subject;

    // The subject parameter will be auto-injected by the factory
    @Inject
    public Greeter(Displayer displayer, @Assisted String subject) {
        this.displayer = displayer;
        this.subject = subject;
    }

    void sayHello() {
        displayer.display(String.format("%s says hello", subject));
    }
}
