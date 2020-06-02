package helper;

import java.util.stream.Collectors;

import com.google.inject.Injector;

public class BindingPrinter {
    public static String generateBindingsString(Injector injector) {
        return injector.getAllBindings().entrySet().stream()
            .map(e -> String.format("%s: %s", e.getKey(), e.getValue()))
            .collect(Collectors.joining("\n"));
    }

    public static Injector printBindings(Injector injector) {
        System.out.println();
        System.out.println("*** Bindings ***");
        System.out.println(generateBindingsString(injector));
        System.out.println("*** End of Bindings ***");
        System.out.println();
        return injector;
    }
}