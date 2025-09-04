import java.util.*;

public class Problem6_FactorialRecursion {
    static long fact(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative not allowed");
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Factorial: " + fact(n));
        sc.close();
    }
}
