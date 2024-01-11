import java.util.Scanner;

public class AnagramCheckerApp {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create an AnagramService object with dependencies for persistence and input validation
        AnagramService anagramService = new AnagramService(new PersistenceManager(), new InputValidator());

        // Prompt the user to enter their username
        System.out.println("Enter username:");
        String username = getInputWithoutSpecialChars(scanner);

        // Prompt the user to enter the first string
        System.out.println("Enter first string:");
        String str1 = getInputWithoutSpecialChars(scanner);

        // Prompt the user to enter the second string
        System.out.println("Enter second string:");
        String str2 = getInputWithoutSpecialChars(scanner);

        // Check if the two input strings are anagrams using the AnagramService
        if (anagramService.checkAnagram(username, str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // A utility function to get user input without special characters
    private static String getInputWithoutSpecialChars(Scanner scanner) {
        String input;
        do {
            // Read a line of input from the user
            input = scanner.nextLine();

            // Check if the input contains special characters and prompt for re-entry if found
            if (containsSpecialChars(input)) {
                System.out.println("Invalid input. Special characters, numbers and spaces are not allowed. Please try again:");
            }
        } while (containsSpecialChars(input)); // Repeat until valid input is provided
        return input;
    }

    // A utility function to check if a string contains special characters
    private static boolean containsSpecialChars(String input) {
        // Check if the input contains any special characters using a regular expression
        return !input.matches("^[a-zA-Z]*$");
    }
}
