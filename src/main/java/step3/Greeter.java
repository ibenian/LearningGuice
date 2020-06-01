package step3;

import com.google.inject.Inject;

/**
 * Created by ibenian on 3/10/17.
 */
public class Greeter {
    private Displayer displayer;

    // It is possible to have a method with muliple injectable parameters.
    // The method will be called at injection time.
    @Inject
    void setDisplayer(Displayer displayer) {
        this.displayer = displayer;
    }

    void sayHello() {
        displayer.display("Hello world");
    }


}
