import java.util.*;

public class Problem10_RemoveSpecificCharacter {
    static String removeChar(String s, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) if (c != ch) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Modified String: " + removeChar(s, ch));
        sc.close();
    }
}
