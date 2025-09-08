package JavaFeatures.MySortingUtil;

import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner {

    public static boolean isEven(Integer num){
        return num % 2 ==0;
    }

    public static void main(String[] args) {

        List<Integer> nums = List.of(3,4,67,89,88);
        Predicate<Integer> evenNum = num -> num % 2 == 0;

        nums.stream().filter(evenNum).forEach(e -> System.out.print(e + " "));
        System.out.println();
        nums.stream().filter(Predicate.not(evenNum)).forEach(e -> System.out.print(e + " "));


    }


}
