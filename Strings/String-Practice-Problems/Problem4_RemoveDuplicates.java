import java.util.*;

public class Problem4_RemoveDuplicates {
    static String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Without duplicates: " + removeDuplicates(s));
        sc.close();
    }
}
