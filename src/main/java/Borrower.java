import java.security.Security;
import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.books.size();
    }

//    Security problems if passing in library?
    public void borrowBookFromLibrary(Library library, Book book) {
        library.removeBookFromLibrary(book);
        this.books.add(book);
    }

}
