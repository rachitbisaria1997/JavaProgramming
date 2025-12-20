package Strings;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dates {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonth());

        System.out.println(today.isLeapYear());

        LocalDateTime localDateTime = null;

        System.out.println(localDateTime.now());
        System.out.println(localDateTime.getDayOfMonth());


    }
}
