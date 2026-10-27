
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class zonedateTime {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current date and time: " + now);

        Set<String> availableZones = ZoneId.getAvailableZoneIds();

        availableZones.forEach(System.out::println);
    }
}
