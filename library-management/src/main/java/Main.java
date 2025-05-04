import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", 1951));

        // Printing all books
        System.out.println("All Books:");
        library.printAllBooks();

        // Finding books by author
        String authorToFind = "George Orwell";
        List<Book> booksByAuthor = library.findBooksByAuthor(authorToFind);
        System.out.println("\nBooks by " + authorToFind + ":");
        booksByAuthor.forEach(System.out::println);

        // Sorting books by title
        List<Book> sortedBooksByTitle = library.sortBooksByTitle();
        System.out.println("\nSorted Books by Title:");
        sortedBooksByTitle.forEach(System.out::println);
    }
}