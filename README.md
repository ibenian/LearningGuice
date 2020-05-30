# Learning Guice
## A step by step guide to learning guice from zero to pro.

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
