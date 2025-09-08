package Java8Features.DefaultMethods;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    //Method references are a shorthand notation of lambda expressions to call a method directly.

    public void print(String s) {
        System.out.println(s);
    }

    public void display(String msg){
        System.out.println("instance print: "+ msg);
    }

    public static void main(String[] args) {

        Demo demo = new Demo();
        List<String> list = Arrays.asList("Apple", "Banana");

        list.forEach(MethodRefDemo::print);

        List<String> names = Arrays.asList("Zara", "Liam", "Noah", "Emma");
        names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);

    }


}
