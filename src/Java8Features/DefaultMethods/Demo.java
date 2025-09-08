package Java8Features.DefaultMethods;

public class Demo {

    public static void main(String[] args) {

        Calculate calculate = new Camel();
        calculate.printName();

        Calculate Abc = () -> {
          System.out.println("this is ABC companny");
        };

        Calculate Xyz = () -> {
            System.out.println("this is XYZ companny");
        };

        Abc.printName();
        Xyz.printName();

        System.out.println(Calculate.methodStaticOne());
        System.out.println(Calculate.methodStaticTwo());

    }

}
