import java.util.*;

public class Problem9_MostFrequentCharacter {
    static char mostFrequent(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        int bestCount = -1;
        char bestChar = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > bestCount) {
                bestCount = freq[i];
                bestChar = (char)i;
            } else if (freq[i] == bestCount && freq[i] > 0 && i < bestChar) {
                bestChar = (char)i;
            }
        }
        return bestChar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (s.isEmpty()) {
            System.out.println("Empty string");
        } else {
            System.out.println("Most Frequent Character: '" + mostFrequent(s) + "'");
        }
        sc.close();
    }
}
