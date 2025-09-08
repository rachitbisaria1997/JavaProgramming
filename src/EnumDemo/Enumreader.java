package EnumDemo;

import java.util.Arrays;

enum Season{
    WINTER(1), SPRING(2), SUMMER(3), FALL(4);

    private int value;

    private Season(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

public class Enumreader {

    public static void main(String[] args) {

        Season season = Season.FALL;

        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);

        System.out.println(Season.SUMMER.ordinal());

        System.out.println(Season.SPRING.getValue());

        System.out.println(Arrays.toString(Season.values()));
    }

}
