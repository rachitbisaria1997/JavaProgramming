package Java8Features.DefaultMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamQues {

    public static void main(String[] args) {

        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> longestStr = strings.stream().max(Comparator.comparingInt(String::length));

        System.out.println(longestStr.get());

    }

}
