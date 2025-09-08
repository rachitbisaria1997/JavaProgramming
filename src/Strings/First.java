package Strings;

import java.util.Locale;

public class First {

    public static void main(String[] args) {

        String str = "in 28 minutes";
        String newstr = str.concat("is awesome");
        System.out.println(newstr);


        String up = str.toUpperCase();
        String lw = str.toLowerCase();

        System.out.println(up);
        System.out.println(lw);

        String orig = "Hello";
        String modified = orig;
        modified = modified.concat("world");

        // new object will be created and assigned to modified object

        System.out.println("orig string is "+ orig);
        System.out.println("modified string is "+ modified);


        // to remove spaces
        // up.trim()

        // String concatenation
        // 1 + 2 = 3
        // "1" + "2" -> 12

        // join method in Strings
        String.join(",", "A", "B", "C");
        // output is "A,B,C"

        // replace a with z
        "abcd".replace('a', 'z');

    }

}
