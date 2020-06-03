package step28;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class DisplayModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.install(
            // Implement a factory that'll inject @Assisted parameters automatically
            new FactoryModuleBuilder()
                //.implement(GreeterInterface.class, GreeterConcrete.class)  // If intereface/concrete implementation is separate
                .build(GreeterFactory.class)
        );
    }

    @Provides
    public Greeter greeter(GreeterFactory factory) {
        // This method will be handed a factory to use
        return factory.create("Ibe2");
    }
}
