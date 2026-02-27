
import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "Madam";

        // Normalize (optional)
        String normalized = input.toLowerCase();

        // Step 1: Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Step 2: Insert characters into deque
        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);  // Insert at rear
        }

        boolean isPalindrome = true;

        // Step 3: Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
