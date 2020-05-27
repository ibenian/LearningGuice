package step22;

import com.google.inject.Binder;
import com.google.inject.Module;

public class DisplayModule implements Module {
    public void configure(Binder binder) {
        binder.bind(DisplayerBase.class).to(FancyDisplayer.class);
    }
}
