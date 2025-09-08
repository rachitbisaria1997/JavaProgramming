package FunctionalPgm;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<? super Integer> evenPredicate = n -> n % 2 == 0;
        Predicate<? super Integer> oddPredicate = n -> n % 2 == 1;

        List.of(23,43,45,36).stream().filter(evenPredicate)
                .map(n -> n * n)
                .forEach(e -> System.out.println(e));

        List.of(23,43,11,15).stream().filter(oddPredicate)
                .map(n -> n * n)
                .forEach(e -> System.out.println(e));

    }
}
