package Java17Features;

public class PatternMatching {

    public static void main(String[] args) {

        Object obj = "Hello, Java 17!";

        switch (obj) {
            case String s -> System.out.println("It's a string of length " + s.length());
            case Integer i -> System.out.println("It's an integer: " + i);
            case null -> System.out.println("It's null");
            default -> System.out.println("Unknown type");
        }

    }

}
