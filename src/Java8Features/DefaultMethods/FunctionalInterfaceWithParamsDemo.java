package Java8Features.DefaultMethods;

public class FunctionalInterfaceWithParamsDemo {

    public static void main(String[] args) {

        CalcOperation addition = (int x, int y) -> {
    
            System.out.println("values are "+ x + ", " + y);
            return x+y;
        };

        double result = addition.operation(30, 20);

        System.out.println(result);

        CalcOperation subtraction = (p, q) -> {
            return p - q;
        };

        CalcOperation multiplication = (p, q) -> {
            return p*q;
        };

        double value = subtraction.operation(30,12);
        System.out.println(value);

        double ans = multiplication.operation(2, 3);
        System.out.println(ans);
    }

}
