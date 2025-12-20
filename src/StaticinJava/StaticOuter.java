package StaticinJava;

public class StaticOuter {

    int x = 10;
    static int y = 20;

    static class Inner{
        void show(){
            System.out.println("Inside static nested class");
            //System.out.println(x); - // cant access non static var
            System.out.println(y); // can access static var
        }
    }
}

//Java does not allow a top-level class to be static.
//But inside another class, you can create a static nested class.

// a static nested class belongs to outer class not an object. can be accessed without creating object of outer class

class Test{

    public static void main(String[] args) {
        StaticOuter.Inner obj = new StaticOuter.Inner();
        obj.show();
        // Inside static nested class
        //20

        // obbject of static class be created, like below
        // Outer.A obj = new Outer.A();
    }
}
