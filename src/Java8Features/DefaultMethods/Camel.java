package Java8Features.DefaultMethods;

public class Camel implements Calculate{

    @Override
    public void printName() {
        System.out.println("this is camel company");
    }

    @Override
    public void methodOne() {
        Calculate.super.methodOne();
        System.out.println("hii");
    }

    @Override
    public void methodTwo() {
        Calculate.super.methodTwo();
        System.out.println("hello");
    }

}

class Newdemo {

    public static void main(String[] args) {

        Camel camel = new Camel();
        camel.printName();
        camel.methodOne();
        camel.methodTwo();

    }
}