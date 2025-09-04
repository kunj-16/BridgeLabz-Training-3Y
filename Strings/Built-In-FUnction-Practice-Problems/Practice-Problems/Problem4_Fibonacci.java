import java.util.*;

public class Problem4_Fibonacci {
    static List<Long> fib(int terms) {
        List<Long> list = new ArrayList<>();
        if (terms <= 0) return list;
        long a = 0, b = 1;
        list.add(a);
        if (terms == 1) return list;
        list.add(b);
        for (int i = 3; i <= terms; i++) {
            long c = a + b;
            list.add(c);
            a = b;
            b = c;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        List<Long> seq = fib(n);
        System.out.println("Fibonacci sequence: " + seq);
        sc.close();
    }
}
