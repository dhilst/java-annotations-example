Java annotations example

# Core concetps

- Annotations are metadata (not simple functions as in python) tied the code.
- Annotations are implemented by `@interface`s where methods are arguments to the annotation.
  - see https://docs.oracle.com/javase/7/docs/technotes/guides/language/annotations.html
- `default` defines a default value for a argument in its absence.
- Retation policy defines the metadata life time. It may be
  - Runtime
  - Class (Retained in the `.class` but not loaded by JVM)
  - Source (Discarted by the compiler)
- Annotations processing depends on the retation:
  - Runtime: Is processed with instrospection at runtime (this example)
  - Source: Is processed by `javac -processor` 
  - Class: ??? 
- Target determine what kind if entity this annotation annotated, for example:
  - Method
  - Field
  - Class
  - .. etc (see https://docs.oracle.com/javase/7/docs/api/java/lang/annotation/ElementType.html)

