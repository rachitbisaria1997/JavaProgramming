package Java8Features.DefaultMethods;

public interface InterfaceTwo {

    default void  defaultMethodThree(){
        System.out.println("Inside default method three");
    }

    default void  defaultMethodFive(){
        System.out.println("Inside InterfaceTwo default method five");
    }
}
