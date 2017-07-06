import java.util.*;

public class SortingBooksTester {
    public static void main(String[] args) {
        Book b1 = new Book("Moby Dick", "Melville", 922);
        Book b2 = new Book("Emma", "Austen", 221);
        Book b3 = new Book();

        ArrayList<Book> books = new ArrayList<>();

        //add books to list
        Collections.sort(books, new BookComparator());

        for (Book b : books) {
            System.out.println(b);
        }
    }
}