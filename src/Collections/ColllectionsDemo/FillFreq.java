package Collections.ColllectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillFreq {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "A"));
        Collections.fill(list, "X");  // X X X

        System.out.println(Collections.frequency(list, "A")); // 2

        Collections.shuffle(list);
        System.out.println(list);

        // (Every run gives different output)

    }

}
