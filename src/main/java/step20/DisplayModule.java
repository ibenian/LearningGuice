package step20;

import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Created by ibenian on 16/5/20.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        try {
			binder.bind(Displayer.class).to(StdoutDisplayer.class);
            binder.bind(Greeter.class)  // Bind Greeter to the specific constructor.  No need to put an @Inject annotation in Greeter
                .toConstructor(Greeter.class.getConstructor(Displayer.class));
            // For more info: https://github.com/google/guice/wiki/ToConstructorBindings
		} catch (Exception e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
		}
    }
}
