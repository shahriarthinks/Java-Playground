import java.lang.*;
public class BookShop implements BookShopOperations{
	
	private String name;
	private Book[] listOfBooks = new Book[100];
	
public BookShop(){}
public BookShop(String name){
	this.name = name;
}
	
public void setName(String name){
	this.name = name;
}	

public String getName(){return name;}

public boolean insertBook(Book b) {
        boolean flag = false;
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i] == null) {
                listOfBooks[i] = b;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Book Added!");
        } else {
            System.out.println("Can't Add Book!");
        }
        return flag;
    }

public boolean removeBook(Book b) {
        int flag = 0;
        for (int i = 0; i < listOfBooks.length; i++) {
            if (listOfBooks[i] == b) {
                listOfBooks[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Book Deleted!");
            return true;
        } else {
            System.out.println("Can't Delete Book!");
            return false;
        }
    }

public void showAllBooks() {
        System.out.println("BookShop Name: " + name);
        for (int i = 0; i < listOfBooks.length; i++) {
            System.out.println("Index: " + i + " Book Slot: " + (i + 1));
            if (listOfBooks[i] != null) {
                listOfBooks[i].showDetails();
                System.out.println();
            } else {
                System.out.println("Nothing to show!");
                System.out.println();
            }
        }
    }

public Book searchBook(String isbn) {
        for (Book b : listOfBooks) {
            if (b != null && b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }
}


