import java.util.*;

public class HashingBooksTester {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        //The reason for putting the more general variable declaration
        //gives us more flexibility. Later we can make it a linkedlist,
        //arraylist, etc.
        //This is the industry way of doing it.

        books.add(new Book("Moby Dick", "Melville", 922));
        books.add(new Book("Moby Dick", "Melville", 922));
        books.add(new Book("Animal Farm", "Orwell", 199));
        books.add(new Book("1984", "Orwell", 245));

        //Create a set
        Set<Book> bookSet = new HashSet<>(books);
        //You can pass it any other collection as long as it implements the
        //collection interface. We want to put the whole arrayList into a set.
        //Adding the whole books List will only add 3 out of the 4 books.
        //Duplicates will automatically be removed when adding a whole collection
        //to a set.

        System.out.println(bookSet);

        //If hashCode was not overridden correctly, the set functionality would
        //not work correctly and we would not have the convenient functionality.
        //Moby dick would be added to the bookset twice. Java uses the hashCode
        //to determine whether an object is already added to a set. Contains
        //method also works by using the hashCode!!

        //You can construct a hashSet entering a collection object as an argument.

        //Overriding hashcode is not necessarily needed for .equals to work, but
        //if we do the 1 method (setting all hashCodes to 1), it is very inefficient.
    }
}