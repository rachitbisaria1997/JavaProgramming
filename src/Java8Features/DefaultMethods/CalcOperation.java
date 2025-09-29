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

// it has only 1 abstract method. it can have any num of default or static methods.

// if there are more than 1 Func interface we will get compile time error.A lambda can only be mapped to one method contract
// — otherwise, the compiler won’t know which abstract method the lambda should implement.
// normal interface or abstract class can have multiple abstract methods
// default method - provides default implementation
// static method cannt be overriden


// used primarily for lambda expressions and method references, which were introduced in Java 8 to support functional programming.