package StaticinJava;

class InitializationExample {
    static {
        System.out.println("Static block executed when class is loaded");
    }
}

public class StaticBlockExample {

    public static void main(String[] args) {

        InitializationExample obj = new InitializationExample();

        // Static block executed when class is loaded
        //It’s mainly used to initialize static variables or perform one-time setup for a class.
    }

}
