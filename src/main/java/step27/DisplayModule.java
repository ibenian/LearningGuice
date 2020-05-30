package step27;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.ProvidesIntoSet;
import com.google.inject.name.Named;

public class DisplayModule implements Module {
    public void configure(Binder binder) {
        // No need to configure here, becasue we use provider methods below        
    }

    @ProvidesIntoSet  // This ensures that this object will be provided as a Set<Displayer> under name "displayers"
    @Named("displayers")
    Displayer stdOutDisplayer() {
        return new StdoutDisplayer();
    }

    @ProvidesIntoSet  // This ensures that this object will be provided as a Set<Displayer> under name "displayers"
    @Named("displayers")
    Displayer loggerDisplayer() {
        // Because we crate it manually here, LoggerDisplayer won't have anyhting auto-injected.
        return new LoggerDisplayer();
    }
}
