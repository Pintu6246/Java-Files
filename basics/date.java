import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class date {
    public static void main(String[] args) {
        LocalDate myDate=LocalDate.now();
        LocalTime myTime=LocalTime.now();
        LocalDateTime myDateTime=LocalDateTime.now();
        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myDateTime);
    }
    
}
