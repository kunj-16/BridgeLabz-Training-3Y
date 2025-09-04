import java.util.*;

public class Problem6_SubstringOccurrences {
    static int countOccurrences(String s, String sub) {
        if (sub.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i + sub.length() <= s.length(); i++) {
            if (s.regionMatches(i, sub, 0, sub.length())) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter substring to count: ");
        String sub = sc.nextLine();
        System.out.println("Occurrences (overlapping): " + countOccurrences(s, sub));
        sc.close();
    }
}
