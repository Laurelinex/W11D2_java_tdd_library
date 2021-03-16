import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void setUp() {
        book = new Book("My Life: A Journey To Disappointment", "Laureline Vaucoy", "Autobiography");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("My Life: A Journey To Disappointment", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Laureline Vaucoy", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Autobiography", book.getGenre());
    }

}
