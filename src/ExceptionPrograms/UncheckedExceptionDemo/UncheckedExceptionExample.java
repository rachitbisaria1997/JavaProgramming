package ExceptionPrograms.UncheckedExceptionDemo;

public class UncheckedExceptionExample {

    public static void main(String[] args){

        int a = 10;
        int b = 0;

        int result = a / b;
        System.out.println("result "+ result);

        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //ArithmeticException extends RuntimeException.
        //
        //No need to explicitly handle it (no compile-time error).
        //
        //The exception occurs only at runtime.

        // unchecked exception can be caught using try catch also to prevent program crashes

//        int a = 10;
//        int b = 0;
//
//        try {
//            int result = a / b;  // This will throw ArithmeticException
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Caught an Unchecked Exception: " + e.getMessage());
//        }
//
//        System.out.println("Program continues after handling the exception.");
    }

}
