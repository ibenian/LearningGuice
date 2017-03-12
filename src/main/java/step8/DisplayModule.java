package step8;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

/**
 * Created by ibenian on 3/10/17.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Displayer.class)
                .annotatedWith(Names.named("for stdout"))
                .to(StdoutDisplayer.class);
        binder.bind(Displayer.class)
                .annotatedWith(Names.named("for times square"))
                .to(TimesSquareDisplayer.class);
    }
}
