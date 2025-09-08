package StaticinJava;

class MathUtils{

    public static int add(int a, int b) {
        return a + b;
    }

}

public class StaticMethodExample {

    public static void main(String[] args) {
        int sum = MathUtils.add(20, 10);  // No need to create an object
        System.out.println("sum is "+ sum);
    }
}
