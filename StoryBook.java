import java.lang.*;
public class StoryBook extends Book{
	
	private String category;
	
public StoryBook() {}	
public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category) {
	
	super(isbn,bookTitle,authorName,price,availableQuantity);
	this.category = category;
}
	
public void setCategory(String category){
	this.category = category;
}	
	
public String getCategory(){return category;}
	
public void showDetails() {
        System.out.println("StoryBook Details:");
        System.out.println("ISBN: " + super.getIsbn());
        System.out.println("Title: " + super.getBookTitle());
        System.out.println("Author: " + super.getAuthorName());
        System.out.println("Price: " + super.getPrice());
        System.out.println("Available Quantity: " + super.getAvailableQuantity());
        System.out.println("Category: " + category);
    }
}	
	
