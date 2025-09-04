import java.util.*;

public class Problem11_AnagramCheck {
    static String normalize(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }
        return sb.toString();
    }
    static boolean areAnagrams(String a, String b) {
        a = normalize(a);
        b = normalize(b);
        if (a.length() != b.length()) return false;
        int[] count = new int[256];
        for (char c : a.toCharArray()) count[c]++;
        for (char c : b.toCharArray()) {
            if (--count[c] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        System.out.println(areAnagrams(a,b) ? "Anagrams" : "Not anagrams");
        sc.close();
    }
}
