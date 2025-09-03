//Library Book Tracker
//Scenario: A library in Delhi wants to track how many books are issued in total and details of each book.
//Requirements:
//1. Create a Book class with instance variables: title (String), author (String), issued (boolean).
//2. Create static variable totalIssuedBooks to keep track of the total number of books issued.
//3. Create a constructor to initialize the book details.
//4. Create getters and setters for all instance variables.
//5. Create a static method showTotalIssued() to print total issued books.
//6. Write a main class to create 3 books, issue some of them (issued = true), and show total issued books.
import java.util.*;

class Book{
	String title;
	String author;
	boolean issued;
	static int totalIssuedBooks = 0;
	static int count = 0;
	
	Book(String title, String author, boolean issued){
		this.title = title;
		this.author = author;
		this.issued = issued;
		if(this.issued == true){
			this.totalIssuedBooks++;
		}
		count++;
		
	}
	
	void getinfo(){
			System.out.println("Book"+count+" issued? "+ this.issued);
	}
	
	static void showTotalIssued(){
		System.out.println("Total Issued: "+ totalIssuedBooks);
	}
	
	
}

class Q3{
	public static void main(String args[]){
		Book book1 = new Book("Harry Potter", "J.K. Rowling", true);
		Book book2 = new Book("Five Point Someone", "Chetan Bhagat", false);
		Book book3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);
		book1.getinfo();
		book2.getinfo();
		book3.getinfo();
		Book.showTotalIssued();

	}
}