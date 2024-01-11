import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
class AnagramServiceTest {
    private AnagramService anagramService;
    private PersistenceManager persistenceManager;
    private InputValidator inputValidator;

    // This method is executed before each test case, setting up the required objects
    @BeforeEach
    void setUp() {
        persistenceManager = new PersistenceManager(); // Create a PersistenceManager instance
        inputValidator = new InputValidator(); // Create an InputValidator instance
        anagramService = new AnagramService(persistenceManager, inputValidator); // Create an AnagramService instance with the above objects
    }

    // Test method for checking if two strings are anagrams
    @Test
    void testAnagram() {
        // Assert that the provided words "listen" and "silent" are anagrams, should return true
        assertTrue(anagramService.checkAnagram("user", "listen", "silent"));

        // Assert that the provided words "hello" and "world" are not anagrams, should return false
        assertFalse(anagramService.checkAnagram("user", "hello", "world"));
    }

    // Test method for checking invalid inputs
    @Test
    void testInvalidInputs() {
        // Assert that inputs "123" and "321" are not valid words, should return false
        assertFalse(anagramService.checkAnagram("user", "123", "321"));

        // Assert that inputs "test@" and "tset" contain invalid characters, should return false
        assertFalse(anagramService.checkAnagram("user", "test@", "tset"));
    }
}
*/