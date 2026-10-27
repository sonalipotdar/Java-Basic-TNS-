
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class eg {

    public static void displayMonth(LocalDate date) {
        Month month = date.getMonth();
        System.out.println("Month: " + month);
    }

    public static void displayYear(LocalDate date) {
        int year = date.getYear();
        System.out.println("Year: " + year);
    }

    public static void lookBackMonths(LocalDate date, int months) {
        LocalDate pastDate = date.minusMonths(months);
        System.out.println("Date after looking back "
                + months + " months: " + pastDate);
    }

    // Main method below the other methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);
        int choice;

        do {
            System.out.println("\n===== Date Explorer =====");
            System.out.println("1. Display Month");
            System.out.println("2. Display Year");
            System.out.println("3. Display Day of Week");
            System.out.println("4. Check Leap Year");
            System.out.println("5. Look Back Months");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayMonth(date);
                    break;

                case 2:
                    displayYear(date);
                    break;

                case 3:
                    System.out.println("Day of Week: "
                            + date.getDayOfWeek());
                    break;

                case 4:
                    if (date.isLeapYear()) {
                        System.out.println("It is a leap year.");
                    } else {
                        System.out.println("It is not a leap year.");
                    }
                    break;

                case 5:
                    System.out.print("Enter months to look back: ");
                    int months = sc.nextInt();
                    lookBackMonths(date, months);
                    break;

                case 6:
                    System.out.println("Exiting DateExplorer. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
