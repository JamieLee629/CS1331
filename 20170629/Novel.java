
public class Novel extends Book {
    private String genre;  // Novel has all the Book attributes and this attribute too

    public Novel(String t, String a, int n, String genre) {
    	super(t,a,n);
    	this.genre = genre;
    }
    public Novel() {
        super();       // call to super must be the first statement of the constructor
       	this.genre = "";
    }
    @Override                         //helps check for erros
    public boolean isLong() {
    	// returns true if the book is already long or the book is a Horror
    	return super.isLong() || (this.genre.equals("Horror"));
    }

    @Override
    public String toString() {
    	return super.toString().substring(0,super.toString().length()-1) + " and is a novel.";
    }

    @Override
    public String getTitle() {
        return super.getTitle() + " a novel.";
    }

    public String getGenre() {
        return this.genre;
    }


}


class NovelDriver {
	public static void main (String[] args) {
		Novel mynovel = new Novel("Emma","Austen",700,"Romance");
		Novel mynovel2 = new Novel();

		System.out.println(mynovel.getNumPages());
		System.out.println(mynovel.isLong());

		Book book1 = new Book("Websters", "Committee", 700);
        System.out.println(book1.isLong());

        System.out.println(mynovel);  

        Textbook jbook = new Textbook("Java programming", "Liang", 1000,"Computer Science");
        System.out.println(jbook);




	}
}