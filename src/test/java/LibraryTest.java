import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    public static final String TITLE = "Test Book";
    public static final String AUTHOR = "Test Author";
    public static final int YEAR = 2024;
    public static final String GENRE = "Test Genre";
    Library library = new Library();

    @Test
    public void testAddBook() {
        Book book = new Book(TITLE, AUTHOR, YEAR, GENRE);
        library.addBook(book);
        assertNotNull(library.findBook(TITLE));
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book(TITLE, AUTHOR, YEAR, GENRE);
        library.addBook(book);
        library.removeBook(TITLE);
        assertNull(library.findBook(TITLE));
    }

    @Test
    public void testFindBook() {
        Book book = new Book(TITLE, AUTHOR, YEAR, GENRE);
        library.addBook(book);
        assertEquals(book, library.findBook(TITLE));
    }

}
