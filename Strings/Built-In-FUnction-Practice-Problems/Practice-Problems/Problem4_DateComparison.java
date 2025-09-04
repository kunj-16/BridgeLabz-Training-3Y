import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem4_DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            System.out.print("Enter first date (yyyy-MM-dd): ");
            LocalDate d1 = LocalDate.parse(sc.nextLine().trim(), f);
            System.out.print("Enter second date (yyyy-MM-dd): ");
            LocalDate d2 = LocalDate.parse(sc.nextLine().trim(), f);

            if (d1.isBefore(d2)) {
                System.out.println("First date is BEFORE second date.");
            } else if (d1.isAfter(d2)) {
                System.out.println("First date is AFTER second date.");
            } else {
                System.out.println("Both dates are EQUAL.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please use yyyy-MM-dd.");
        } finally {
            sc.close();
        }
    }
}
