package JavaFeatures.MySortingUtil;

import java.util.ArrayList;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("ranga");
        names.add("ravi");
        names.add("john");

        List<String> copyOfNames = List.copyOf(names);
        copyOfNames.add("dje");

        System.out.println(copyOfNames);


    }

}
