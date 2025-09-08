package Java8Features.DefaultMethods;

public class ClassOne implements InterfaceOne {


    @Override
    public void printNames() {
        System.out.println("ClassOne : printing names");
    }

    @Override
    public String getNames() {
        defaultMethodOne();
        System.out.println("ClassOne : getting names");
        return "default method";
    }

    @Override
    public void defaultMethodOne(){
        System.out.println("inside class one default method one");
    }

}
