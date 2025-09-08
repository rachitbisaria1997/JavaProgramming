package JavaFeatures.MySortingUtil;

public class StringNewApiRunner {

    public static void main(String[] args) {

        // below were added in java 12 & 13
        System.out.println(" ".isBlank());

        System.out.println(" L R ".strip().replace(" ", "@"));
        System.out.println(" L R ".stripLeading().replace(" ", "@"));
        System.out.println(" L R ".stripTrailing().replace(" ", "@"));

        String str = null;
        System.out.println(str.isBlank());


    }

}
