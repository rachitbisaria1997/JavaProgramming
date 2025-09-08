package AnonymousClassRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class LengthComparator implements Comparator<String>{

    @Override
    public int compare(String st1, String str2){
        return Integer.compare(st1.length(), str2.length());
    }
}

public class First {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>(List.of("Ant", "Cat", "Ball", "Elephant"));

        Collections.sort(animals, new LengthComparator());
        System.out.println(animals);

        // below is example of anonymous class
        Collections.sort(animals, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println(animals);

    }

}
