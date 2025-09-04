import java.util.*;

public class Problem8_CompareStrings {
    static int lexCompare(String a, String b) {
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            char ca = a.charAt(i), cb = b.charAt(i);
            if (ca != cb) return ca - cb;
        }
        return a.length() - b.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        int cmp = lexCompare(a,b);
        if (cmp < 0) System.out.println('"' + a + '"' + " comes before " + '"' + b + '"');
        else if (cmp > 0) System.out.println('"' + a + '"' + " comes after " + '"' + b + '"');
        else System.out.println("Both strings are equal");
        sc.close();
    }
}
