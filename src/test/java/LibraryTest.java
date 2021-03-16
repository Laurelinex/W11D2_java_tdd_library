import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp() {
        library = new Library(2);
        book1 = new Book("My Life: A Journey To Disappointment", "Laureline Vaucoy", "Autobiography");
        book2 = new Book("Busting Heads And Breaking Hearts", "Laureline Vaucoy", "Autobiography");
        book3 = new Book("Alien Earth", "Megan Lindholm", "Sci-Fi");
    }

    @Test
    public void canCountBooks() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookIfEnoughCapacity() {
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void cannotAddBookIfNoCapacity() {
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void canCheckIfStockFullFalseIfNotFull() {
        assertEquals(false, library.isFull());
    }

    @Test
    public void canCheckIfStockFullTrueIfFull() {
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        assertEquals(true, library.isFull());
    }

}
