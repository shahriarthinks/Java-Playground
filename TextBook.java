import java.lang.*;  
public class TextBook extends Book {
   
   private int standard;

    public TextBook() {}

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) { 
	this.standard = standard; 
	}
	
    public int getStandard() { return standard; }

    public void showDetails() {
        System.out.println("TextBook Details:");
        System.out.println("ISBN: " + super.getIsbn());
        System.out.println("Title: " + super.getBookTitle());
        System.out.println("Author: " + super.getAuthorName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Available Quantity: " + super.getAvailableQuantity());
        System.out.println("Standard: " + standard);
    }
}