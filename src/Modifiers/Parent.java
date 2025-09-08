package Modifiers;

public final class Parent {

    public final void show(){
        System.out.println("this method cant be overridden");
    }
}

public class Demo extends Parent{

    // final method cant be overriden

    @Override
    public void show() {

    }
}

class NewClass extends Parent{

    // final class cant be inherited

}

class Example {

    public static void main(String[] args) {

        // A final reference variable cannot change its reference, but the object’s data can be modified.

        final StringBuilder sb =
                new StringBuilder("Hello");

        sb.append(" World"); // Allowed

        // ❌ Compilation Error
        // sb = new StringBuilder("New");

    }

}

// interfaces can have static methods
interface MathOperations {
    static int square(int n) {
        return n * n;
    }
}

class Demo{

    public static void main(String[] args) {

        int result = MathOperations.square(5);
        System.out.println(result);

    }
}

// access modifiers
| Modifier                  | Accessible From                             |
        | ------------------------- | ------------------------------------------- |
        | `public`                  | Everywhere (any class, any package)         |
        | `protected`               | Same package + subclasses in other packages |
        | `default` *(no modifier)* | Only within the same package                |
        | `private`                 | Only within the same class                  |


// non access modifiers
// final  - prevent the class from being inherited
// abstract - The class cannot be instantiated; must be subclassed

// for methods
// final - method cant be overriden
// abstract - must be implemented in a subclass
// synchronized - only one thread can access method at a time

// for variables.
// final - value cant be changed
// static - shared among all the instances
// volatile = var can be modofied by multiple threads, ensures visibility


