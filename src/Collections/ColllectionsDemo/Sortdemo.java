package Collections.ColllectionsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sortdemo {

    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(lst);
        System.out.println(lst);

        // [4, 3, 2, 1]

        List<Integer> list2 = Arrays.asList(4, 2, 9, 1);
        Collections.sort(list2);
        System.out.println(list2); // [1, 2, 4, 9]

    }

}
