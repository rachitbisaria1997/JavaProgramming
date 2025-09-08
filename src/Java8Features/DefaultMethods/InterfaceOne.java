package Java8Features.DefaultMethods;

public interface InterfaceOne {

    void printNames();
    String getNames();

    default void  defaultMethodOne(){
        System.out.println("Inside default method one");
    }

    default void defaultMethodTwo(){
        System.out.println("Inside default method two");
    }

    default void defaultMethodFive(){
        System.out.println("Inside InterfaceOne default method five");
    }

    static String staticMethodOne(){
        System.out.println("this is static methodOne");
        return "this is a static method";
    }

    static void staticMethodTwo(){
        System.out.println("this is static static method two");
    }

}
