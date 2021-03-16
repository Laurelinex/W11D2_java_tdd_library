import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genres;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
        this.genres = new HashMap<String, Integer>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBookToLibrary(Book book) {
        if(!isFull()){
            this.books.add(book);
            String genre = book.getGenre();
            this.genres.put(genre, 1);
        }
    }

    public boolean isFull() {
        if(capacity > countBooks()) {
            return false;
        }
        return true;
    }

    public void removeBookFromLibrary(Book book) {
        if(this.countBooks() > 0) {
            this.books.remove(book);
        }
    }

    public int numberOfBooksByGenre(String genre){
        int total = 0;
        for(Book book : this.books) {
            if(genre == book.getGenre()) {
//                this.genres.get(genre);
                total += 1;
            }
        }
//        return this.genres.get(genre);
        return total;

    }

}
