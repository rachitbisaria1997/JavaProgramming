package Java8Features.DefaultMethods;

@FunctionalInterface
public interface CalcOperation {

    double operation(int a, int b);

    default void printInfo(){
        System.out.println("this default data of method");
    }

    static void typeOfOperations(){
        System.out.println("static content : arithmetic operations");
    }
}

// it has only 1 abstract method. it can have default or static methods.

// if there are more than 1 Func interface we will get compile time error.

// default method - provides default implementation
// static method cannt be overriden


// used primarily for lambda expressions and method references, which were introduced in Java 8 to support functional programming.