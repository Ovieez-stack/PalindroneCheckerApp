import java.util.Scanner;

public class PalidroneCheckerApp {

    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker App Management System");
        System.out.print("Enter a word or sentence: ");

        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("It is a Palindrome ");
        } else {
            System.out.println("It is NOT a Palindrome ");
        }

        scanner.close();
    }
}
