import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PersistenceManager {
    private Map<String, Boolean> cache; // A map to store cached results
    private File file; // File to persist results to disk

    // Constructor for initializing the cache and loading data from a file
    public PersistenceManager() {
        cache = new HashMap<>();
        file = new File("anagram_results.txt"); // Create or use a file named "anagram_results.txt"
        loadCache(); // Load cached results from the file during object creation
    }

    // Load cached results from the file into the cache
    private void loadCache() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 4) {
                    // Parse the data from each line and store it in the cache
                    cache.put(generateKey(parts[1], parts[2]), Boolean.parseBoolean(parts[3]));
                }
            }
        } catch (IOException e) {
            // Handle exceptions related to file reading
        }
    }

    // Save the result of an anagram check to the cache and the file
    public void saveResult(String username, String str1, String str2, boolean isAnagram) {
        String key = generateKey(str1, str2); // Generate a unique key for the cache
        if (!cache.containsKey(key)) {
            cache.put(key, isAnagram); // Store the result in the cache
            appendToFile(username, str1, str2, isAnagram); // Append the result to the file
        }
    }

    // Generate a unique key for caching based on the input strings
    private String generateKey(String str1, String str2) {
        return str1 + "|" + str2;
    }

    // Append the result to the file
    private void appendToFile(String username, String str1, String str2, boolean isAnagram) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(username + ":" + str1 + ":" + str2 + ":" + isAnagram + "\n");
        } catch (IOException e) {
            // Handle exceptions related to file writing
        }
    }
}
