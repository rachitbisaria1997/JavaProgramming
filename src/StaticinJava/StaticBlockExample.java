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
    }

}
