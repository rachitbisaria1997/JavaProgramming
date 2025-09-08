package Java11Features;

public class StringDemo {

    public static void main(String[] args) {
        String str = "  Hello Java 11  ";

        System.out.println(str.isBlank());
        System.out.println(" ".isBlank());
        System.out.println(str.strip());
        System.out.println("Hi!!".repeat(3));
    }

}
