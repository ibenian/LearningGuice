package step21;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.matcher.Matchers;

/**
 * Created by ibenian on 17/5/20.
 */
public class DisplayModule implements Module {
    public void configure(Binder binder) {
        try {
            binder.bind(Displayer.class).to(StdoutDisplayer.class);
            binder.bindInterceptor(Matchers.any(), Matchers.any(), new MethodLoggingInterceptor());
		} catch (Exception e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
		}
    }
}
