import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String[] words = new String[8];

        words[5] = "jij";

        Optional<String> checkNull = Optional.ofNullable(words[10]);

        if(checkNull.isPresent()){
            String name = checkNull.get();
            System.out.println(name.toUpperCase());
        }
        else{
            System.out.println(checkNull.isPresent());
        }

        Optional<String> nameContainer = getName();

        nameContainer.ifPresentOrElse(

                (val) -> {
                    System.out.println("value is not present");
                },
                () -> {
                    System.out.println("val is not present");
                }

        );

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
