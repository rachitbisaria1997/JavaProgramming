package Java8Features.DefaultMethods;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionInterfaceMethods {

    public static void main(String[] args) {

        Function<Integer, Double> halfValue = i -> i/2.0;

        double result = halfValue.apply(10);

        System.out.println(result);

        // half and then multiple by 3
        Function<Integer, Double> half = i -> i / 2.0;
        half = half.andThen(a -> 3 * a);
        System.out.println(half.apply(10));

        // convert to upper case
        Function<String, String> funcToUpperCase = String::toUpperCase;
        System.out.println(funcToUpperCase.apply("rachit bisaria"));

        // null check and then do upper case
        Function<String, String> func2nullCheck = str -> str == null ? "enter a valid value" : str;

        //String value = func2nullCheck.andThen(funcToUpperCase).apply("this is rachit bisaria");
        String value = func2nullCheck.andThen(funcToUpperCase).apply("rachit bisaria");
        System.out.println(value);

        // compose function -> first apply compose and than divide
            Function<Integer, Double> newhalf = a -> a/2.0;
        newhalf = newhalf.compose(a -> 3 * a);
        System.out.println(newhalf.apply(5));

        //Identity function
        // returns a function that returns its only argument.
        Function<Integer, Integer> i = Function.identity();
        System.out.println(i.apply(10));

        //stream API
        Stream<String> names = Stream.of("one", "two", "three");
        List<String> values = names.map(Function.identity()).collect(Collectors.toList());
        System.out.println(values);

    }

}
