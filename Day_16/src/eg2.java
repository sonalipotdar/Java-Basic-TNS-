
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.DateTimeException;
import java.util.Scanner;

public class eg2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time zone (e.g. Asia/Tokyo): ");
        String zoneInput = scanner.nextLine();

        try {
            ZoneId zone = ZoneId.of(zoneInput);

            ZonedDateTime time = ZonedDateTime.now(zone);

            System.out.println("Time zone: " + zone);
            System.out.println("Current date and time: " + time);

        } catch (DateTimeException e) {
            System.out.println("Invalid time zone!");
        }

        scanner.close();
    }
}
