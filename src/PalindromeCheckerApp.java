public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "Racecar";

        // Normalize (optional but recommended)
        String normalized = input.toLowerCase();

        // Step 1: Convert string to char array
        char[] characters = normalized.toCharArray();

        // Step 2: Two-pointer technique
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Step 3: Compare characters
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
