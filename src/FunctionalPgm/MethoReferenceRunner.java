package FunctionalPgm;

import java.util.List;

public class MethoReferenceRunner {

    public static void print(Integer number){
        System.out.print(number + " ");
    }

    public static boolean isEven(Integer integer){
        return integer % 2 ==0;
    }

    public static void main(String[] args){

        List.of("Ant", "Bat", "Cat", "Dog").stream()
                .map(s -> s.length())
                .forEach(s -> MethoReferenceRunner.print(s));

        System.out.println();


        System.out.println();

        int max = List.of(12,23,16,18).stream().filter(MethoReferenceRunner::isEven).max(Integer::compare).orElse(0);

        System.out.println(max);

    }

}
