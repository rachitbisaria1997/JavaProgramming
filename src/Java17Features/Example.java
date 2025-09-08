package Java17Features;

import java.util.Optional;

public class Example {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Alice");

        String result = name.orElseThrow();
        System.out.println(result);

        Optional<String> empty = Optional.empty();
        String fail = empty.orElseThrow();

        System.out.println(fail);

    }
}
