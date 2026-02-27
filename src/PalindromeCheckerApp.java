import java.util.Deque;
import java.util.ArrayDeque;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "Madam";


        String normalized = input.toLowerCase();


        Deque<Character> deque = new ArrayDeque<>();


        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;


        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
