package Collections.MapDemo;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {

        Map<Day, String> map = new EnumMap<>(Day.class);

        map.put(Day.MONDAY, "Gym");
        map.put(Day.TUESDAY, "Walk");
        String ans = map.get(Day.WEDNESDAY);
        System.out.println(ans);
        System.out.println(Day.TUESDAY.ordinal());

    }

}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
