import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
    }

    @Test
    public void testAddBook() {
        List<Book> books = library.getBooks();
        assertEquals(3, books.size());
    }

    @Test
    public void testFindBooksByAuthor() {
        List<Book> booksByOrwell = library.findBooksByAuthor("George Orwell");
        assertEquals(1, booksByOrwell.size());
        assertEquals("1984", booksByOrwell.get(0).getTitle());
    }

    @Test
    public void testGetBooks() {
        List<Book> books = library.getBooks();
        assertEquals(3, books.size());
        assertEquals("The Great Gatsby", books.get(0).getTitle());
        assertEquals("1984", books.get(1).getTitle());
        assertEquals("To Kill a Mockingbird", books.get(2).getTitle());
    }

    @Test
    public void testSortBooksByTitle() {
        List<Book> sortedBooks = library.sortBooksByTitle();
        assertEquals("1984", sortedBooks.get(0).getTitle());
        assertEquals("The Great Gatsby", sortedBooks.get(1).getTitle());
        assertEquals("To Kill a Mockingbird", sortedBooks.get(2).getTitle());
    }

    @Test
    public void testPrintAllBooks() {
        
        library.printAllBooks();
    }
}