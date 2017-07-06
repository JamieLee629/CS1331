import java.util.*;
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


    public String toString() {    // returns a string that tells about the object's attributes
    	 return String.format("%s : %s was written by %s and has %d pages.",
            this.isbn,this.title,this.author,this.numpages);
    }

    @Override
    public boolean equals(Object other) {
       if (!(other instanceof Book)) {
           return false;
       }
       if (other == this) {
           return true;
       } 
       return (this.title.equals(((Book)other).title) && (this.author.equals(((Book)other).author)));
    }

    @Override
    public int hashCode() {
      //start with 17 and convert field into number
      //First field of Book is title.
      int result = 17;
      result = 31 * result + this.title.hashCode(); //Takes the values of the letters of the string and
                      //performs operations on them to return an integer value
      result = 31 * result + this.author.hashCode();
      result = 31 * result + this.numpages;
      return result;
    }

}

