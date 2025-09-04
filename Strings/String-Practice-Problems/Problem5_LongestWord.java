import java.util.*;

public class Problem5_LongestWord {
    static String longestWord(String sentence) {
        String[] tokens = sentence.trim().split("[^A-Za-z]+");
        String best = "";
        for (String t : tokens) {
            if (t.length() > best.length()) best = t;
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        System.out.println("Longest word: " + longestWord(s));
        sc.close();
    }
}
