public class Textbook extends Book {

    private String subject;

    public Textbook(String t, String a, int n, String s) {
        super(t,a,n);
        this.subject = s;	
    }
    public Textbook() {
        super();              // a call to super must be the first thing in the constructor
        subject = "Unknown";
    }

    public void setTitle() {
    	String newstring = getTitle() + " ( " + this.subject + ")";
    	super.setTitle(newstring);
    }

    public String toString() {
        return super.toString() + " Subject: " + this.subject;
    }

    @Override
    public String getTitle() {
        return super.getTitle() + " a textbook.";
    }

}    