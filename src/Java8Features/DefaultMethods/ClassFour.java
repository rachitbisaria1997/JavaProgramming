package Java8Features.DefaultMethods;

public class ClassFour implements InterfaceOne{

    @Override
    public void printNames(){
        System.out.println("this is class four names");
    }

    @Override
    public String getNames() {
        System.out.println("this is class four get names");
        return "this is class four getnames";
    }

}
