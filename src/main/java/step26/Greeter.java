package step26;

import java.util.Set;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Greeter {
    private final Set<Displayer> displayers;

    @Inject
    Greeter(@Named("displayers") Set<Displayer> displayers) {
        this.displayers = displayers;
    }

    void sayHello() {
        displayers.forEach(d -> d.display("Hello world"));
    }
}
