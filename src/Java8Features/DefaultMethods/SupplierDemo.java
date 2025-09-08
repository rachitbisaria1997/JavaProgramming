package Java8Features.DefaultMethods;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<LocalDateTime> dateTIme = () -> LocalDateTime.now();

        System.out.println(dateTIme.get());
        System.out.println(dateTIme.get());

        printCurrentTimeNow(dateTIme);
    }

    public static void  printCurrentTimeNow(Supplier<LocalDateTime> dateTime){

        System.out.println(dateTime.get());
    }

}
