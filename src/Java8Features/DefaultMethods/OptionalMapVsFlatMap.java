package Java8Features.DefaultMethods;

import java.util.Locale;
import java.util.Optional;

public class OptionalMapVsFlatMap {

    public static void main(String[] args) {

        Optional<String> nameContainer = Optional.of("Dilip Singh");

        String result = nameContainer.map(val -> val.toUpperCase()).get();

        System.out.println(result);

        Optional<Optional<String>> nameContainer2 = Optional.of(Optional.of("Rachit Bisaria"));

        result = nameContainer2.flatMap(value -> value).get().toUpperCase();
        System.out.println(result);

    }

}
