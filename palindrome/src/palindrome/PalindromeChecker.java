package palindrome;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();
        
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        if (isPalindrome(cleanedInput)) {
        	System.out.printf("%s is a palindrome.",input);
        } else {
        	System.out.printf("%s is not a palindrome.",input);
        }
        
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}