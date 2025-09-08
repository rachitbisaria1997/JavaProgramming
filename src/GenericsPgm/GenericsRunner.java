package GenericsPgm;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static <T> T doubleValue(T value){
        return value;
    }

    // below is upper bound wildcard. list can hold elements of any type that is a subclass of number ex List<Integer>, List<Double>, List<Float>.
    // Iterates over the list, converts each Number to a double using doubleValue(), and calculates the sum.

    static double sumOfNumberList(List<? extends  Number> numbers){
        double sum = 0.0;
        for(Number number : numbers){
            sum += number.doubleValue();
        }
        return sum;
    }

    // below is lower bound wildcard. it accepts Accepts a list of Number or any superclass of Number. adds various numeric values to the list

    static void addACoupleOfValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }

    public static void main(String[] args) {

        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("element 1");
        list1.addElement("element 2");
        System.out.println(list1);
        System.out.println(list1.getElement(1));

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(10);
        list2.addElement(20);
        System.out.println(list2);

        String value = doubleValue("fefe");
        Integer num1 = doubleValue(10);
        ArrayList<Integer> al = new ArrayList<>(List.of(1,2,3));
        System.out.println(doubleValue(al));

        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1L,2L,3L,4L,5L)));

        List emptyList = new ArrayList<Number>();

        addACoupleOfValues(emptyList);

        System.out.println(emptyList);

    }

}
