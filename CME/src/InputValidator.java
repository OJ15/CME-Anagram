public class InputValidator {
    // Method to validate input strings
    public boolean validate(String input) {
        // Check if the input is not null and contains only alphabetic characters (letters)
        return input != null && input.matches("[a-zA-Z]+");
    }
}
