package Java8Features.DefaultMethods;

@FunctionalInterface
public interface MyFunctionalInterface {

    public void printMessage(String message);

}

class DDemo{

    public static void main(String[] args) {

        MyFunctionalInterface myFunctionalInterface = message -> System.out.println(message);
        myFunctionalInterface.printMessage("hellow");

    }

}
