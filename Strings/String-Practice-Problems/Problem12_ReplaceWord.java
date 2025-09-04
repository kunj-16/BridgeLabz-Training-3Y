import java.util.*;
import java.util.regex.*;

public class Problem12_ReplaceWord {
    static String escapeRegex(String s) { return Pattern.quote(s); }
    static String replaceWord(String sentence, String oldWord, String newWord) {
        String pattern = "\\b" + escapeRegex(oldWord) + "\\b";
        return sentence.replaceAll(pattern, Matcher.quoteReplacement(newWord));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();
        System.out.println("Result: " + replaceWord(sentence, oldWord, newWord));
        sc.close();
    }
}
