import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library(2);
        book1 = new Book("My Life: A Journey To Disappointment", "Laureline Vaucoy", "Autobiography");
    }

    @Test
    public void bookCollectionStartsEmpty() {
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBookToLibrary(book1);
        borrower.borrowBookFromLibrary(library, book1);
        assertEquals(1, borrower.countBooks());
        assertEquals(0, library.countBooks());
    }

}
