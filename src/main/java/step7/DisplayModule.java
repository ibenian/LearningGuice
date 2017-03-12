package step7;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by ibenian on 3/10/17.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Displayer.class)
                .annotatedWith(ForStdout.class)
                .to(StdoutDisplayer.class);
        binder.bind(Displayer.class)
                .annotatedWith(ForTimesSquare.class)
                .to(TimesSquareDisplayer.class);
    }
}
