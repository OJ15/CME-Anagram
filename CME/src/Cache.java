import java.util.HashMap;
import java.util.Map;

public class Cache {
    private Map<String, Boolean> anagramResults; // A map to store key-value pairs (string key, boolean value)

    // Constructor for initializing the cache as a HashMap
    public Cache() {
        anagramResults = new HashMap<>();
    }

    // Method to put a key-value pair into the cache
    public void put(String key, boolean isAnagram) {
        anagramResults.put(key, isAnagram);
    }

    // Method to retrieve a value associated with a key from the cache
    public Boolean get(String key) {
        return anagramResults.get(key);
    }
}
