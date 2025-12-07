package Collections.ColllectionsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class MaxMin {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 40, 2, 99);
        System.out.println(Collections.max(list));  // 99
        System.out.println(Collections.min(list));  // 2

    }
}
