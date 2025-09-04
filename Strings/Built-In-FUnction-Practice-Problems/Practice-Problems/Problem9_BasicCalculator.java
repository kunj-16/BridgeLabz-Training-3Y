import java.util.*;

public class Problem9_BasicCalculator {
    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }
    static double div(double a, double b) { 
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().trim().charAt(0);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        try {
            double res;
            switch (op) {
                case '+': res = add(a,b); break;
                case '-': res = sub(a,b); break;
                case '*': res = mul(a,b); break;
                case '/': res = div(a,b); break;
                default: System.out.println("Invalid op"); sc.close(); return;
            }
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
