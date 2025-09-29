package Strings;

public class StrExam {

    public static void main(String[] args) {

        String a = "rachit";
        String b = new String("rachit");

        String c = a;

        System.out.println(a == b); // false
        System.out.println(a == c); // true

        System.out.println(b.intern() == a); // true. intern() stores the string in string pool constant, if string exists it returns ref from pool
                                                // helps in memory optimization


    }

}
