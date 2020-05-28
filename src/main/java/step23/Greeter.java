package step23;

import com.google.common.base.Strings;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import step23.DisplayModule.MessageTemplateMarker;

public class Greeter {
    private final Displayer displayer;
    private final String messageTemplate;
    private final int numStars;
    private final int numSpaces;

    // messageTemplate is injected by matching @MessageTemplateMarker annotation with provider in the module
    // numStars is injected by matching @Named("NumStars") annotation with provider in the module
    // numSpaces is injected by matching @Named("NumSpaces") annotation with an explicit binding in the module.
    @Inject
    Greeter(
        Displayer displayer,  // Match by type
        @MessageTemplateMarker String messageTemplate,  // Match by custom annotation
        @Named("NumStars") int numStars,  // Match by name
        @Named("NumSpaces") int numSpaces) {  // Match by name

        this.displayer = displayer;
        this.messageTemplate = messageTemplate;
        this.numStars = numStars;
        this.numSpaces = numSpaces;
    }

    void sayHello(String name) {
        displayer.display(
            Strings.repeat("*", numStars) + Strings.repeat(" ", numSpaces) + String.format(messageTemplate, name)
        );
    }
}
