package FunctionalPgm;

import java.util.List;

public class First {

    //In functional programming, functions are treated like variables: you can pass them as arguments,
    // return them from other functions, and assign them to variables.


    public static void main(String[] args) {
        List<Integer> al = List.of(1,4,7,9);
        al.forEach(el -> System.out.println(el));

        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        printBasicWithFiltering(list);
        printWithFiltering(list);
        printWithFilteringMod(al);
        addNumbers(al);
        sumOddNums(al);
        normalSum(al);

    }

    private static void printBasic(List<String> list){
        for(String st : list){
            System.out.println(st);
        }
    }

    private static void printBasicWithFiltering(List<String> list){
        for(String st : list){
            System.out.println(st);
        }
    }

    private static void printWithFiltering(List<String> list){
        list.stream()
                .filter(el -> el.endsWith("at"))
                .forEach(el -> System.out.println("element -" + el));
    }

    private static void printWithFilteringMod(List<Integer> list){
        list.stream().filter(el -> el % 2 == 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private static void addNumbers(List<Integer> nums){

        int sum = nums.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.print(sum + "  ");
        System.out.println();
    }

    private static void sumOddNums(List<Integer> nums){
        int sum = nums.stream()
                    .filter(num -> num % 2 == 1)
                    .reduce(0, (num1, num2) -> num1 + num2);
        System.out.print(sum + " ");
        System.out.println();
    }

    private static void normalSum(List<Integer> nums){
        int sum = 0;
        for(int n : nums){
            sum+= n;
        }
        System.out.print(sum + " ");
    }

}
