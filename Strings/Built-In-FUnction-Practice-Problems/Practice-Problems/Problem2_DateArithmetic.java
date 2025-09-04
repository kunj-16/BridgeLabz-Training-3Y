import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem2_DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String in = sc.nextLine().trim();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate d;
        try {
            d = LocalDate.parse(in, f);
        } catch (Exception e) {
            System.out.println("Invalid date format.");
            sc.close();
            return;
        }
        LocalDate result = d.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Original: " + d.format(f));
        System.out.println("After +7 days, +1 month, +2 years, then -3 weeks: " + result.format(f));
        sc.close();
    }
}
