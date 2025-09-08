package Strings;

import java.time.LocalDate;

public class Dates {

    public static void main(String[] args) {


        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getMonth());

        System.out.println(today.isLeapYear());


    }
}
