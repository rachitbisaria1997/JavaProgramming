package Java8Features.DefaultMethods;

public class MethodRefDemo {

    public static void main(String[] args) {

        ConvertToUpper toUpper = (value) ->{
            return value.toUpperCase();
        };

        System.out.println(toUpper.convertToUpper("rachit"));
    }

}
