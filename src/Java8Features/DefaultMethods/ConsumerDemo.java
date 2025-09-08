package Java8Features.DefaultMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        List<String> names = List.of("abc", "xyz", "pqr");

        Consumer<String> printUpperCase = str ->System.out.println(str.toUpperCase());

        printUpperCase.accept("rachit bisaria");

        names.forEach(printUpperCase);

        List<String> newValues = new ArrayList<>();
        Consumer<String> addToList = str -> newValues.add(str.toUpperCase());

        names.forEach(addToList);
    }

}
