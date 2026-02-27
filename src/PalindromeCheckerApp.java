import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "Madam";

        // Normalize (optional but recommended)
        String normalized = input.toLowerCase();

        char[] characters = normalized.toCharArray();

        // Step 1: Create Stack
        Stack<Character> stack = new Stack<>();

        // Step 2: Push characters into stack
        for (char ch : characters) {
            stack.push(ch);
        }

        boolean isPalindrome = true;

        // Step 3: Pop and compare
        for (int i = 0; i < characters.length; i++) {
            char popped = stack.pop();

            if (characters[i] != popped) {
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
