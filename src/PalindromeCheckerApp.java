
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";

        String normalized = input.toLowerCase();
        char[] characters = normalized.toCharArray();

        // Step 1: Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Step 2: Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Step 3: Insert characters
        for (char ch : characters) {
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Step 4: Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue (FIFO)
            char fromStack = stack.pop();     // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Step 5: Print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
