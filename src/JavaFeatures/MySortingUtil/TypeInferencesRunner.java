package JavaFeatures.MySortingUtil;

import java.util.List;

public class TypeInferencesRunner {

    //added in java 10
    public static void main(String[] args) {

        List<String> names1 = List.of("ranga", "ravi");
        List<String> names2 = List.of("arun", "kumar");

        final var names = List.of(names1, names2);

        names.stream().forEach(s -> System.out.println(s));

        for(var name : names){
            System.out.print(name + " ");
        }

        System.out.println();

        var filter = List.of("arun", "kumar").stream().filter(s -> s.length() > 4);
        filter.forEach(f -> System.out.println(f));
    }

}
