package Java17Features;

import JavaFeatures.MySortingUtil.StringNewApiRunner;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ExtendedSwtich {

    public static void main(String[] args) {

        String day = "MONDAY";

        int num = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
            case "TUESDAY" -> 7;
            case "THURSDAY", "SATURDAY" -> 8;
            case "WEDNESDAY" -> 9;
            default -> throw new IllegalArgumentException("Invalid day: " + day);

        };
        System.out.println(num);

    }

}
