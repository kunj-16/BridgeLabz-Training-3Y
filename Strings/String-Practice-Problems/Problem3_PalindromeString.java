import java.util.*;

public class Problem3_PalindromeString {
    static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s) ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}
