import java.time.LocalDate;
import java.time.LocalTime;
import java . time.LocalDateTime;
public class DateTimeWork {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date is; "+date);

        LocalTime time = LocalTime.now();
        System.out.println("The time is: "+time);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Time and Date are: "+ldt);


        System.out.println("Year is: "+date.getYear());
        System.out.println("Month is: "+date.getMonth());
        System.out.println("Day is: "+date.getDayOfWeek());
    }
}
