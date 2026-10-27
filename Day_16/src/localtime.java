
import java.time.LocalTime;

public class localtime {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);

        LocalTime customTime = LocalTime.of(11, 32, 45);
        System.out.println("Custom time: " + customTime);

        LocalTime par = LocalTime.parse("15:30:45");
        System.out.println("Parsed time: " + par);
    }
}
