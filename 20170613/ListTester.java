import java.util.ArrayList;

class ListTester {
    public static void main(String[] args) {
        // Intro to ArrayList
        // ArrayList books = new ArrayList(); //or "new ArrayList<>()"
        // books.add(new Integer(3));

        // //books.add(3); is ILLEGAL!!

        // books.add(new Double(3.5));
        // //books.remove(1); //removes item at position 1

        // books.set(1, new Integer(5));
        // System.out.println(books);
        // System.out.println(books.size());

        // ArrayList<Book> books = new ArrayList<Book>();
        // books.add(new Novel("Emma","Austen",212, "Romance"));
        // books.add(new Book());
        // books.add(new Book("1984", "Orwell", 343));
        // System.out.println(((Novel)books.get(0)).getGenre());
        // System.out.println(books.size());
    
    }
}

class BookTester {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        //random number of novels between 1 and 5
        int randomNum = (int)(Math.random()*5) + 1;

        for (int i = 0; i < randomNum; i++) {
            Book n = new Novel();
            books.add(n);
        }

        //random number of textbooks between 4 and 9 (index)
        int randomNum = (int)(Math.random()*6) + 4;
        for (int x = 0; x < randomNum; x++) {
            Book t = new Textbook();
            books.add(t);
        }
        //Use instance of
        //Write a loop to print out the genre of all the novels in the ArrayList
        for (int j = 0; j < books.size(); j++) {
            if (books.get(j) instanceof Novel) {
                System.out.println((books.get(j)).getGenre());
            }
        }

    }
}