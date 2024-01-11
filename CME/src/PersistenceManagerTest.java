import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

/* class PersistenceManagerTest {
    private PersistenceManager persistenceManager;

    // Use @TempDir to create a temporary directory for testing
    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        // Create a new instance of PersistenceManager with the temporary directory path
        persistenceManager = new PersistenceManager();
    }

    @Test
    void testSaveAndLoadResults() {
        // Test data
        String username = "testUser";
        String str1 = "cat";
        String str2 = "act";
        boolean isAnagram = true;

        // Save the result using PersistenceManager
        persistenceManager.saveResult(username, str1, str2, isAnagram);

        // Check if the result is cached
        assertTrue(persistenceManager.isCached(str1, str2));

        // Check if the cached result matches the expected value
        assertEquals(isAnagram, persistenceManager.getCachedResult(str1, str2));
    }

    @Test
    void testNonAnagramSaveAndLoadResults() {
        // Test data for a non-anagram case
        String username = "testUser";
        String str1 = "dog";
        String str2 = "god";
        boolean isAnagram = false;

        // Save the result using PersistenceManager
        persistenceManager.saveResult(username, str1, str2, isAnagram);

        // Check if the result is cached
        assertTrue(persistenceManager.isCached(str1, str2));

        // Check if the cached result matches the expected value
        assertEquals(isAnagram, persistenceManager.getCachedResult(str1, str2));
    }
}
*/