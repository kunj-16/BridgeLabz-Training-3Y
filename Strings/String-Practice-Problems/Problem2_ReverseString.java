import java.util.*;

public class Problem2_ReverseString {
    static String reverse(String s) {
        char[] a = s.toCharArray();
        int i=0, j=a.length-1;
        while (i<j) {
            char t=a[i]; a[i]=a[j]; a[j]=t;
            i++; j--;
        }
        return new String(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Reversed: " + reverse(s));
        sc.close();
    }
}
