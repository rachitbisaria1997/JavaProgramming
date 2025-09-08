package Java8Features.DefaultMethods;

public class Classtwo implements InterfaceOne{


    @Override
    public void printNames() {
        System.out.println("ClassTwo : printing names");
    }

    @Override
    public String getNames() {
        defaultMethodTwo();
        System.out.println("ClassTwo : getting names");
        return "default method";
    }
}
