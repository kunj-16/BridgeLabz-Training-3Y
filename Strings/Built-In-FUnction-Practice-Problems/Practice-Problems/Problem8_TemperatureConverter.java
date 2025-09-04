import java.util.*;

public class Problem8_TemperatureConverter {
    static double fToC(double f) { return (f - 32) * 5.0 / 9.0; }
    static double cToF(double c) { return c * 9.0 / 5.0 + 32; }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'F' to convert Fahrenheit->Celsius or 'C' for Celsius->Fahrenheit: ");
        char ch = sc.next().trim().toUpperCase().charAt(0);
        if (ch == 'F') {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + fToC(f));
        } else if (ch == 'C') {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + cToF(c));
        } else {
            System.out.println("Invalid option.");
        }
        sc.close();
    }
}
