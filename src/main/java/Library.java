import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBookToLibrary(Book book) {
        if(!isFull()){
            this.books.add(book);
        }
    }

    public boolean isFull() {
        if(capacity > countBooks()) {
            return false;
        }
        return true;
    }
}
