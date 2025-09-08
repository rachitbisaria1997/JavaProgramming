package Java8Features.DefaultMethods;

@FunctionalInterface
public interface Calculate {

    void printName(); // abstract method


    default void methodOne(){
        System.out.println("this is default method one");
    }

    default void methodTwo(){
        System.out.println("this is default method two");
    }

    static boolean methodStaticOne(){
        System.out.println("this is static method one");
        return true;
    }

    static boolean methodStaticTwo(){
        System.out.println("this is static method two");
        return true;
    }

}
