import java.util.Calendar;
import java.util.Date;
import static utils.Output.println;

public class CalendarClasses {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2002);
        calendar.set(Calendar.MONTH, Calendar.JULY);
        calendar.set(Calendar.DATE, 18);
        calendar.set(Calendar.HOUR_OF_DAY, 2);

        Date date = calendar.getTime();
        println("My birthday is " + date);
    }
}
