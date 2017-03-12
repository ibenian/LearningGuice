package step11;

import com.google.inject.Inject;
import com.google.inject.Provider;

import java.time.LocalDate;


/**
 * Created by ibenian on 3/10/17.
 */
public class DisplayProvider
    implements Provider<Displayer> {
    @Inject Provider<TimesSquareDisplayer> tsdp;    // Guice injects free provider
    @Inject Provider<StdoutDisplayer> sodp;         // Guice injects free provider

    public Displayer get() {
        switch (LocalDate.now().getDayOfWeek()) {
            case SATURDAY:
                return tsdp.get();      // On-demand instantiation
            default:
                return sodp.get();      // On-demand instantiation
        }
    }
}
