import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.ChronoUnit.DAYS;

public class Aufgabe3 {

    public static void main(String[] args) {
        LocalDate birth =  LocalDate.of( 1995 , Month.OCTOBER , 12 );
        Long ageInDays = DAYS.between(birth, LocalDate.now());
        System.out.println(birth.getDayOfWeek());
        System.out.println(ageInDays);
    }
}
