package Collections.ColllectionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Copydemo {

    public static void main(String[] args) {

        List<String> src = Arrays.asList("A", "B", "C");
        List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z", "W"));

        System.out.println("Before copy:");
        System.out.println("Source: " + src);
        System.out.println("Destination: " + dest);

        Collections.copy(dest, src);

        System.out.println("After copy:");
        System.out.println("Source: " + src);
        System.out.println("Destination: " + dest);

//        Before copy:
//        Source: [A, B, C]
//        Destination: [X, Y, Z, W]
//
//        After copy:
//        Source: [A, B, C]
//        Destination: [A, B, C, W]


    }

}
