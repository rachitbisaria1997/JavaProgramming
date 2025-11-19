package StaticinJava;

class Outer{
    static class A{
        void show(){
            System.out.println("Inside A");
        }
    }
}

class B extends Outer.A
{

}

public class StaticNestedDemo {

    public static void main(String[] args) {

        B obj = new B();
        obj.show();

    }

}
