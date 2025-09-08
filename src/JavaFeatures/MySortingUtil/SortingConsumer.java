package JavaFeatures.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class SortingConsumer {

    private static Logger logger = Logger.getLogger(SortingConsumer.class.getName());

    public static void main(String[] args) {

        SortingUtil sortingUtil = new SortingUtil();

        List<String> sorted = sortingUtil.sortNames(List.of("rachit", "ravi", "karan"));

        logger.info(sorted.toString());
    }

}
