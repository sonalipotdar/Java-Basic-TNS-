
import java.time.LocalDate;

class customedate {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate customDate = LocalDate.of(2026, 12, 31);

        System.out.println("Today's date is: " + now);
        System.out.println("Custom date is: " + customDate);
    }
}
