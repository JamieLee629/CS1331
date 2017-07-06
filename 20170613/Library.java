public class Library {
	private String name;
	private Book[] books;
	private int numbooks;
	private Book popularBook;
	private int year;

	public Library (String n, int year) {
		this.name = n;
		this.numbooks = 0;
		this.year = year;
		this.books = new Book[100]; //allocating room for 100 books
		this.popularBook = null;
	}

	public Library () {
		this.name = "";
		this.numbooks = 0;
		this.books = new Book[100]; //allocating room for 100 books	
		this.year = 0;
		this.popularBook = null;	
	}
	//getters
	public int getYear() {
		return this.year;
	}
    //setters
	public void setYear(int y) {
		this.year = y;
	}

	public void addBook(Book b) {
		this.books[this.numbooks] = b;
		this.numbooks++;  // later check if we have enough memory at this point
	}

	public String toString() {
		return this.name +", created in " + this.year + " has " + this.numbooks + ".";
	}
}

class LibraryTester {
	public static void main (String[] args) {
		Library gtlib = new Library ("Georgia Tech Library",1903);
		Book mybook = new Novel("Emma","Austen",212, "Romance");
		Book otherbook = new Textbook("Intro to Java", "Liang", 989, "CS");
		gtlib.addBook(mybook);
		gtlib.addBook(otherbook);

		System.out.println(mybook.getTitle()); //This is implicitly casting a Novel into a book.
											   //Can only do this if the thing on the right is a
											   //A subtype of the thing on the right.
		//System.out.println(mybook.getGenre()); //This will error at compile time because mybook is not
											   //stored in a Novel variable
		System.out.println(((Novel)mybook).getGenre()); //Legal
		System.out.println(otherbook.getTitle()); //This is implicit casting also.

		System.out.println(gtlib);

		//Create an array of books
		// Book[] books = new Novel[25]; //Even though it is a Book[] array, the elements are novels.
		// books[0] = mybook;
		// books[1] = new Textbook("Intro to Java", "Liang", 989, "CS"); //illegal

		Book[] books = new Book[25];
		books[0] = mybook;
		books[1] = new Textbook("Intro to Java", "Liang", 989, "CS");

		for (Book b : books) {
			System.out.println(b);
			//System.out.println(b.getGenre()); //THIS IS ILLEGAL (WONT COMPILE)
											  //there is no getGenre() method for the book type
											  //Cannot cast all b's to Novel, b/c not all books in the book array are novels.


		}

	}

}