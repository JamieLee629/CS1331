import java.util.*;

public class BookComparator implements Comparator<Book> {
    //You are only required to define one method: the compare method.
    public int compare(Book a, Book b) {
        return a.getNumPages() - b.getNumPages();
    }
}