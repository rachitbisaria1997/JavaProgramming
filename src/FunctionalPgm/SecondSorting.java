package FunctionalPgm;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondSorting {

    public static void main(String[] args) {

        List<Integer> nums = List.of(3,5,8,213,45,7);
        List<String> fruits = List.of("Apple", "Bat", "Ant");

        nums.stream().sorted().forEach(e -> System.out.print(e + " "));

        System.out.println();

        nums.stream().distinct().forEach(e -> System.out.print(e + " "));

        nums.stream().distinct().sorted().forEach(e -> System.out.println(e + " "));

        nums.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));

        // print squares of first 10 nums
        IntStream.range(1, 11).forEach( e -> System.out.print(e * e + " "));

        // print in lowercase
        System.out.println();

        List<String> fruitsL = fruits.stream().map(String::toLowerCase).collect(Collectors.toList());

        for(String fr : fruitsL){
            System.out.println(fr);
        }

        fruits.stream().forEach( e -> System.out.print(e.toLowerCase() + " "));

        System.out.println();

        fruits.stream().forEach(e -> System.out.print(e.length() + " "));

        System.out.println();

        int ans = IntStream.range(1, 11).reduce(0, (n1 , n2) -> n1 + n2);
        System.out.println(ans);

        int max = List.of(23,12,34,53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
        System.out.println(max);

        int min = List.of(23,12,34,53).stream().min((n1, n2) -> Integer.compare(n1, n2)).get();
        System.out.println(min);


        List<Integer> al = List.of(23, 12,34,53).stream().filter(e -> e %2  == 1).collect(Collectors.toList());
        for(int i : al){
            System.out.print(i + " ");
        }

        List<Integer> nm = IntStream.range(1, 11).map(e -> e *e ).boxed().collect(Collectors.toList());
        for(int i : nm){
            System.out.print(i + " ");
        }
    }
}
