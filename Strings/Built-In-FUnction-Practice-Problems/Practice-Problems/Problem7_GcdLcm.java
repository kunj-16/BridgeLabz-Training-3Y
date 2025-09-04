import java.util.*;

public class Problem7_GcdLcm {
    static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
    static long lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs((long)a / gcd(a,b) * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("GCD: " + gcd(a,b));
        System.out.println("LCM: " + lcm(a,b));
        sc.close();
    }
}
