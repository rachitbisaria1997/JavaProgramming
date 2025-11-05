import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> ageCheck = age -> age > 21;

        System.out.println(ageCheck.test(44));

    }

}
