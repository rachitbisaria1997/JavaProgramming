package Java8Features.DefaultMethods;

public class ClassThree implements InterfaceOne, InterfaceTwo{

    @Override
    public void printNames() {
        System.out.println("print names of class three");
    }

    @Override
    public String getNames() {
        System.out.println("get names of class three");
        return null;
    }

    @Override
    public void defaultMethodFive(){
        InterfaceOne.super.defaultMethodFive();
    }

}
