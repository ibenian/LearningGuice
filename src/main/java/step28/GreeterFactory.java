package step28;

/**
 * Custom factory for assisted injection.
 * https://github.com/google/guice/wiki/AssistedInject
 * We don't have to implement this interface because it is already implemented by FactoryModuleBuilder.
 */
public interface GreeterFactory {
    public Greeter create(String subject);  // Parameter will be matched with @Assisted parameters
}