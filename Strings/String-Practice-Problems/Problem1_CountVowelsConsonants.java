import java.util.*;

public class Problem1_CountVowelsConsonants {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int vowels = 0, consonants = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }
}
