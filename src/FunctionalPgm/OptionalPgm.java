package FunctionalPgm;

import java.util.List;
import java.util.Optional;

public class OptionalPgm {

    public static void main(String[] args){

        List<Integer> nums = List.of(10,20,30,40);

        Optional<Integer> maxEven = nums.stream().filter(n -> n % 2 == 0).max(Integer::compare);

        System.out.println(maxEven.orElse(0));
    }

}
