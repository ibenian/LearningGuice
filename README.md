# Learning Guice
## A step by step guide to learning guice from zero to pro.

* **Step1 - Instantiating without Injection** \
Using Guice injector to instantiate a class without any injections.

* **Step2 - Field Injection** \
Using `@Inject` on a private field to be set at injection time.

* **Step3 - Method Injection** \
Using `@Inject` on a method to be called at injection time.

* **Step4 - Method Injection** \
Using `@Inject` on a method to be called at injection time.

* **Step4 - Constructor Injection** \
Using `@Inject` to inject arguments to a constructor.

* **Step5 - Injecting Multiple Constructor Arguments** \
Injecting multiple constructor arguments.

* **Step6 - Binding Interfaces to Classes** \
Bind an interface to a class imperatively in a module.

* **Step7 - Binding with an Annotation** \
Bind to classes marked with a custom annotation

* **Step8 - Binding with a Name** \
Bind to classes annotated with a name.

* **Step9 - Binding a Constant** \
Binding a constant to an argument marked with a custom annotation.

* **Step10 - Custom Provider** \
Implementing a custom provider that instantiates classes or provides existing instances.

* **Step11 - Lazy Instantiating Provider** \
Conditionally instantiating classes using guice injected providers of them.

* **Step12 - Binding to a Class in Singleton Scope** \
Using `.in(scope)` to bind to a class instantiated in the singleton scope.

* **Step13 - Binding Declaratively to a Singleton** \
Using `@Singleton` to bind to a class instantiated as a singleton.

* **Step14 - Binding Imperatively to a Singleton** \
Using `.asEagerSingleton()` to bind to a class instantiated as a singleton.

* **Step15 - Binding to an Existing Instance** \
Using `.toInstance(...)` to bind to an existing instance.

* **Step16 - Lazy Instantiation via Providers** \
Injecting a provider to do lazy instantiation.

* **Step17 - @ImplementedBy** \
Using `@ImplementedBy` to declare an implementation on an interface.

* **Step18 - @ProvidedBy** \
Using `@ProvidedBy` to declare a provider of an interface.

* **Step19 - @Provides** \
Using `@Provides` to implement a provider method on a module.

* **Step20 - Binding Constructors** \
Binding to a constructor in module configuration instead of using `@Inject` annotation on it.

* **Step21 - Binding Interceptors** \
Implement and bind a method logging interceptor.

* **Step22 - Using Modules** \
Create an injector without and with a module.

* **Step23 - Binding Primitives** \
Binding constant values of primitive types injectable like other objects.

* **Step24 - Delayed Injection** \
Injecting `Provider<T>` instead instead of `T` to instantiate the classes on-demand rather than at construction.

* **Step25 - Assisted injection** \
Using `@Assisted` annotation to auto-inject custom factory arguments into objects. 

* **Step26 - Set Multibinding** \
Using `Multibinder` to add multiple bindings to a named Set.  The bound objects become injectable on anything that declared with `@Named(...) Set<...>`.

* **Step27 - Declarative Set Multibinding** \
Using `@ProvidesIntoSet` on providers to inject multiple instances into a set.  This is similar to Step26 which does the same thing using `Multibinder`.
