package step18;

import com.google.inject.ProvidedBy;

/**
 * Created by ibenian on 3/10/17.
 */
@ProvidedBy(DisplayProvider.class)      // Bind to a provider class here, rather than module
public interface Displayer {
    void display(String s);
}
