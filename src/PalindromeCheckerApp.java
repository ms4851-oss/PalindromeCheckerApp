public class PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        if (normalized.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
