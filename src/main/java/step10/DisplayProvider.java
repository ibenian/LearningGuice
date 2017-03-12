package step10;

import com.google.inject.Provider;

import java.time.Clock;
import java.time.LocalDate;


/**
 * Created by ibenian on 3/10/17.
 */
public class DisplayProvider
    implements Provider<Displayer> {

    public Displayer get() {
        switch (LocalDate.now().getDayOfWeek()) {
            case SATURDAY:
                return new TimesSquareDisplayer();
            default:
                return new StdoutDisplayer();
        }
    }
}
