package JavaFeatures.MySortingUtil;

public class SwitchExpressionRunner {

    public static void main(String[] args) {

    }

    public static String findDayOfWeek(int day){

        String dayOfWeek = switch (day){

            case 0 -> {
                System.out.println("some logic here");
                yield "Sunday";
            }
            case 1 -> {
                System.out.println("its monday");
                yield "monday";
            }
            case 2 -> {
                System.out.println("its tuesday");
                yield "tuesday";
            }


            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

        return dayOfWeek;
    }

}
