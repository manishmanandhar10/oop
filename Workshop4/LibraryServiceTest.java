package Workshop4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    private LibraryService libraryService;
    @BeforeAll
    public static void setupBeforeClass() {
        System.out.println("Starting LibraryService Tests...");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("LibraryService Tests Completed.");
    }

    @BeforeEach
    public void setUp() {
        libraryService = new LibraryService();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test completed.");
    }

    @Test
    public void testAddAndSearchBook() {
        libraryService.addBook("1984");
        assertTrue(libraryService.searchBook("1984"));
    }

    // Test for searching a book that doesn't exist in the library
    @Test
    public void testSearchBookNotFound() {
        assertFalse(libraryService.searchBook("Moby Dick"));
    }

    // Test for adding multiple books and ensuring they are found
    @Test
    public void testAddMultipleBooksAndSearch() {
        libraryService.addBook("The Great Gatsby");
        libraryService.addBook("To Kill a Mockingbird");
        assertTrue(libraryService.searchBook("The Great Gatsby"));
        assertTrue(libraryService.searchBook("To Kill a Mockingbird"));
    }
}
