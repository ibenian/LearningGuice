package step12;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

/**
 * Created by ibenian on 3/10/17.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Displayer.class)
                .to(TimesSquareDisplayer.class)
                .in(Singleton.class);
    }
}
