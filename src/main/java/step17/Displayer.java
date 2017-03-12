package step17;

import com.google.inject.ImplementedBy;

/**
 * Created by ibenian on 3/10/17.
 */
@ImplementedBy(TimesSquareDisplayer.class)  // Implementation provided here rather than in module
public interface Displayer {
    void display(String s);
}
