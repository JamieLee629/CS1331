public class Book {
    private String title;  // attributes
    private String author;
    private int numpages;
    private ISBN isbn;

    public Book (String title, String author, int numpages) {  // constructor
        this.title = title;
        this.author = author;
        this.numpages = numpages;
        this.isbn = new ISBN();
    }

    public Book () {  // constructor
        this.title = "";
        this.author = "";
        this.numpages = 0;
        this.isbn = new ISBN();
    }
    
    // getters
    public String getTitle() {
      return this.title;
    }
    public String getAuthor() {
      return this.author;
    }
    public int getNumPages() {
      return this.numpages;
    }
    public ISBN getISBN() {
      return this.isbn;
    }
    // setters
    public void setTitle(String t) {
      this.title = t;
    }
    public void setAuthor(String a) {
      this.author = a;
    }
    public void setISBN() {
      this.isbn = new ISBN();   // generate a new random number
    }

    //other methods

    public boolean isLong() {
    	return (this.numpages > 400);
    }

    public int getTitleLength() {
    	return this.title.length();      
    }

    //No need to put @Override to override something in the Object class
    //Overriding the equals method
    public boolean equals(Object o) {
      if (o instanceof Book) {
        return (this.title.equals(o.getTitle) && this.author.equals(o.getAuthor()));
        //If items are Book objects, we have access to the author and title variables,
      }
      return false;
    }

    public String toString() {    // returns a string that tells about the object's attributes
    	return String.format("%s : %s was written by %s and has %d pages.",
            this.isbn,this.title,this.author,this.numpages);
    }
}


class BookTester {
  public static void main (String[] args) {
  	Book book1 = new Book("Moby Dick","Melville",922);  // call the constructor
  	                                                   //book1 is an object of the Book class
  	Book book2 = new Book("Emma","Austen", 241);
  	Book book3 = new Book();
  	Book book4;
  	book4 = book3;
    Book[] books = new Book[4];
    books[0] = new Book("Moby Dick","Melville",922);
    books[1] = new Book();
    books[2] = new Book();
    books[3] = new Book();

    for (Book b: books) {
      System.out.println(b);   // will find the toString method
    }


  	System.out.println(book1.isLong());
  	System.out.println(book2.isLong());

  	System.out.println(book2.getTitleLength());

    System.out.println(book1);

    //System.out.println(book1.numpages);    // numpages is private!
    System.out.println(book1.getNumPages());  // call the public method instead

    


  }

}

