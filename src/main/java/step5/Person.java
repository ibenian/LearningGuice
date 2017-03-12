package step5;

import com.google.inject.Inject;

/**
 * Created by ibenian on 3/10/17.
 */
public class Person {
    final String name;

    @Inject
    Person(String name) {
        this.name = name;
    }
}
