public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Palindrome Checker- Hardcore Input");
        string word="madam";
        string reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println(word + "is a palindrome");
        }else{
            System.out.println(word + "is NOT a Palindrome");
        }
    }
}
