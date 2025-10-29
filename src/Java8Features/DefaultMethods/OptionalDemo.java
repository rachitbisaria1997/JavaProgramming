package Java8Features.DefaultMethods;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String[] words = new String[8];
        words[5] = "jij";

        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent()){
            String name = checkNull.get();
            System.out.println(name.toUpperCase());
            System.out.println(checkNull.isPresent());
        }
        else{
            System.out.println("not present");
        }

        System.out.println("--------------------------------");

        String name = "Rachit Bisaria";
        Optional<String> value = null;

        if(name == null){
            value = Optional.empty();
        }
        else{
            value = Optional.of(name);
        }

        System.out.println(value);


        System.out.println("--------------------------------");

        Optional<String> nameContainer = getName();
        nameContainer.ifPresent(val -> System.out.println(val.toUpperCase()));
        nameContainer.ifPresentOrElse(

                (val) -> {
                    System.out.println("value is present");
                    System.out.println(val.toUpperCase());
                },
                () -> {
                    System.out.println("value not present");
                }

        );

        System.out.println("--------------------------------");

        String result = nameContainer.or(
                () -> {
                    return Optional.of("Java Optional or method value");
                }
        ).get();

        System.out.println(result);

        System.out.println("--------------------------------");

        result = nameContainer.orElse("this is or else method value");
        System.out.println(result);

        System.out.println("--------------------------------");

        result = nameContainer.orElseThrow();
        System.out.println(result);

        System.out.println("--------------------------------");

        Optional<String> verifiedContainer = nameContainer.filter(

                val -> val.equalsIgnoreCase("Dilip Singh")
        ).or(
                () -> Optional.of("Dilip Singh of or method")

        );

        System.out.println(verifiedContainer.get());

    }

    public static Optional<String> getName(){

        String name = "Rachit Bisaria";

        Optional<String>value =null;

        if(name ==  null){
            value =Optional.of(name);
        }
        System.out.println(value);

        return value;
    }

}
