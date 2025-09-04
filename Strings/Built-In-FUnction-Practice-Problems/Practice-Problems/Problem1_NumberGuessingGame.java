import java.util.*;

public class Problem1_NumberGuessingGame {
    private static final Scanner sc = new Scanner(System.in);
    private static int generateGuess(int low, int high, Random rnd) {
        // Pick a random number in [low, high]
        return low + rnd.nextInt(high - low + 1);
    }
    private static String getFeedback(int guess) {
        System.out.print("Is your number " + guess + "? (enter 'low' / 'high' / 'correct'): ");
        return sc.next().trim().toLowerCase();
    }
    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100 (inclusive). I will try to guess it!");
        int low = 1, high = 100;
        Random rnd = new Random();
        while (low <= high) {
            int guess = generateGuess(low, high, rnd);
            String fb = getFeedback(guess);
            if ("correct".equals(fb)) {
                System.out.println("Yay! I guessed it.");
                return;
            } else if ("low".equals(fb)) {
                low = Math.max(low, guess + 1);
            } else if ("high".equals(fb)) {
                high = Math.min(high, guess - 1);
            } else {
                System.out.println("Please answer with 'low', 'high', or 'correct'.");
            }
        }
        System.out.println("Hmm, something went wrong. Are you sure you followed the rules?");
    }
}
