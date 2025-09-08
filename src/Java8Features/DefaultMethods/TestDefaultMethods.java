package Java8Features.DefaultMethods;

public class TestDefaultMethods {

    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();

        classOne.defaultMethodOne();
        classOne.defaultMethodTwo();

        System.out.println(classOne.getNames());
        System.out.println("-----------------------------------");

        Classtwo classtwo = new Classtwo();
        classtwo.defaultMethodOne();
        classtwo.defaultMethodTwo();
        System.out.println(classtwo.getNames());

        ClassThree classThree = new ClassThree();
        classThree.defaultMethodOne();
        classThree.defaultMethodTwo();
        classThree.defaultMethodThree();

        classThree.defaultMethodFive();

        System.out.println(InterfaceOne.staticMethodOne());
        InterfaceOne.staticMethodTwo();


    }
}
