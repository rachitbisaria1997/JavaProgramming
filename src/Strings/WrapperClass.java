package Strings;

import java.time.LocalDate;

public class WrapperClass {

    public static void main(String[] args) {

        //wrapper classes wraps around a data type and gives an object appearance

        Float floatWrapper = Float.valueOf(57.0f);
        int floatToInt = floatWrapper.intValue();
        System.out.println(floatToInt);

        // Integer i1 = new Integer(5);
        // Integer i2 = new Integer(5);
        // i1 == i2 -> false

        // Integer i3 = new Integer.valueOf(5);
        // Integer i4 = new Integer.valueOf(5);
        // i3 == i4 true
        
        // autoboxing - conversion of primitive type to its corresponding wrapper class object.
        int num = 10;
        Integer obj = num; // int -> Integer

        //unboxing - conversion of wrapper class to its corresp primitive type
        Integer objj = new Integer(20);
        int numm = objj;

    }

}
