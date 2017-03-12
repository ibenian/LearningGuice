package step14;

import com.google.inject.Singleton;

/**
 * Created by ibenian on 3/10/17.
 */
public class TimesSquareDisplayer implements Displayer {
    public void display(String s) {
        System.out.println("*** " + s + " ***");
    }
}
