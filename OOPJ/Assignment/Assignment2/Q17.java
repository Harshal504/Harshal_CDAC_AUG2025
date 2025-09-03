//Library Book Addition
//Scenario: Create Book class with bookId, title, author.
//● Constructor + Getters/Setters
//● Create Library class with libraryName and static totalBooks
//● Method addBook(Book b) → increments totalBooks
//● Method displayTotalBooks() → prints totalBooks
//● Add 2 books to library and display total books
import java.util.*;

class Book{
	int bookID;
	String title;
	String author;
	
	Book(int bookID, String title, String author){
		this.bookID=bookID;
		this.title=title;
		this.author=author;
	}
	
	
}

class Library{
	String LibraryName;
	static int totalBooks=0;
	
	Library(String LibraryName){
		this.LibraryName = LibraryName;
	}
	
	void addBook(Book b){
		totalBooks++;
		
	}
	
	void displayTotalBooks(){
		System.out.println("Total Books: "+ totalBooks);
	}
}

class Q17{
	public static void main(String args[]){
		
		Library l1 = new Library("Kalyan Library");
		
		Book b1 = new Book(111, "Protien Lassi", "Amul");
		Book b2 = new Book(122, "onion cream", "Balaji");
		
		l1.addBook(b1);
		l1.addBook(b2);
		
		l1.displayTotalBooks();

}
}