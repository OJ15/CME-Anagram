import java.util.Arrays;

public class AnagramService {
    private PersistenceManager persistenceManager;
    private InputValidator inputValidator;

    // Constructor that initializes the AnagramService with PersistenceManager and InputValidator
    public AnagramService(PersistenceManager persistenceManager, InputValidator inputValidator) {
        this.persistenceManager = persistenceManager;
        this.inputValidator = inputValidator;
    }

    // Method to check if two strings are anagrams and save the result
    public boolean checkAnagram(String username, String str1, String str2) {
        // Validate input strings using the InputValidator
        if (!inputValidator.validate(str1) || !inputValidator.validate(str2)) {
            return false;
        }

        // Check if the input strings are anagrams
        boolean isAnagram = isAnagram(str1, str2);

        // Save the result (whether they are anagrams or not) using PersistenceManager
        persistenceManager.saveResult(username, str1, str2, isAnagram);

        // Return the result of the anagram check
        return isAnagram;
    }

    // Private helper method to check if two strings are anagrams
    private boolean isAnagram(String str1, String str2) {
        // Check if the lengths of the input strings are different, which means they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the input strings to character arrays and sort them
        char[] str1Chars = str1.toCharArray();
        char[] str2Chars = str2.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        // Compare the sorted character arrays to check if they are the same
        return Arrays.equals(str1Chars, str2Chars);
    }
}
