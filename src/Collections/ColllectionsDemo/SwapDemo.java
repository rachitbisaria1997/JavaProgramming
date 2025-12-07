package Collections.ColllectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class SwapDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Before swap: " + fruits);

        Collections.swap(fruits, 1, 3);

        System.out.println("After swap: " + fruits);

//        Before swap: [Apple, Banana, Mango, Orange]
//        After swap: [Apple, Orange, Mango, Banana]



    }

}
