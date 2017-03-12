package step19;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;

import java.time.LocalDate;

/**
 * Created by ibenian on 3/10/17.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        // No need for binding since we use @Provides on a factory method
    }

    @Provides
    public Displayer getDisplayer() {
        switch (LocalDate.now().getDayOfWeek()) {
            case SATURDAY:
                return new TimesSquareDisplayer();
            default:
                return new StdoutDisplayer();
        }
    }
}
