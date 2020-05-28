package step23;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.inject.Qualifier;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class DisplayModule implements Module {
    // Marker annotation
    @Qualifier @Retention(RUNTIME) @interface MessageTemplateMarker { }
  
    public void configure(Binder binder) {
        // Bind named annotation to a primitive value
        binder.bind(Integer.class).annotatedWith(Names.named("NumSpaces")).toInstance(3);
    }

    // This provider will provide a StdoutDisplayer without matching
    @Provides
    public Displayer displayer() {
        System.out.println("Called displayer()");
        return new StdoutDisplayer();
    }

    // This provider will provide a String primitive value annotated with MessageTemplateMarker
    @Provides
    @MessageTemplateMarker
    public String messageTemplate() {
        System.out.println("Called messageTemplate()");
        return "Hi %s";
    }

    // This provider will provide an int primitive value annoted with Named("NumStars")
    @Provides
    @Named("NumStars")
    public int numberOfStars() {
        System.out.println("Called numberOfStars()");
        return 5;
    }
}
