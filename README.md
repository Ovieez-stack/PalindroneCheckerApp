// version 2.0
// author: Abc
// Use Case 2: Palindrome Checker App with user input and basic logic

import java.util.Scanner;

public class PalindromeCheckerApp {
public static void main(String[] args) {
System.out.println("Welcome to Palindrome Checker App Management System");
System.out.println("Modify this logic to use case 2");

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word or sentence to check (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Palindrome Checker App. Goodbye!");
                break;
            }

            // Clean input: remove spaces and punctuation, convert to lowercase
            String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (cleaned.isEmpty()) {
                System.out.println("Please enter a valid word or sentence.");
                continue;
            }

            // Check palindrome
            boolean isPalindrome = isPalindrome(cleaned);

            if (isPalindrome) {
                System.out.println("✅ \"" + input + "\" is a palindrome!");
            } else {
                System.out.println("❌ \"" + input + "\" is NOT a palindrome.");
            }
        }

        scanner.close();
    }

    // Method to check palindrome logic
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}