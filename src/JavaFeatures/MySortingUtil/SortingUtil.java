package JavaFeatures.MySortingUtil;

import java.util.List;

public class SortingUtil {

    public List<String> sortNames(List<String> names){

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(names);

        return names;
    }

}
