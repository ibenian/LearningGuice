package step26;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

public class DisplayModule implements Module {
    public void configure(Binder binder) {
        Multibinder<Displayer> multibinder = Multibinder.newSetBinder(binder, Displayer.class, Names.named("displayers"));
        // Names.named() is optional.  If not specified, then it will just it will just provide Set<Displayer>.
        // If we bind to objects, no more injection will occur on those objects
        // multibinder.addBinding().toInstance(new StdoutDisplayer());
        // multibinder.addBinding().toInstance(new LoggerDisplayer());
        // But if we bind to the classes, those will be fully constructed with injections on them.
        multibinder.addBinding().to(StdoutDisplayer.class);
        multibinder.addBinding().to(LoggerDisplayer.class);
    }
}
