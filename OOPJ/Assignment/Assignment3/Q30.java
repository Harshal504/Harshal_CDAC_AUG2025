//Library Management System
//Scenario: Manage books and library members with borrowing functionality.
//Problem Statement:
//● Class Book → private variables: bookId, title, author (Encapsulation)
//● Abstract Class LibraryMember → instance variables: memberId, name
//○ Abstract method borrowBook(Book book)
//● Class StudentMember extends LibraryMember → limit 3 books
//● Class FacultyMember extends LibraryMember → limit 5 books
//● Interface Notifyable → method sendNotification(String message) → notify members about overdue books
//● In main(), create 1 student and 1 faculty, borrow books, send notifications
//Sample Input: Student → borrow 2 books Faculty → borrow 4 books
//Sample Output: StudentMember Amit borrowed 2 books FacultyMember Prof. Singh borrowed 4 books Notification sent to Amit: Return books within 7 days Notification sent to Prof. Singh: Return books within 14 days


import java.util.*;



class Book{
	private int bookId;
	private String title;
	private String author;
	
	Book(int bookId, String title, String author){
		this.bookId = bookId;
		this.title=title;
		this.author=author;
	}

	public int getBookId() {
		return this.bookId;
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	

	
} 

interface Notifyable{
	public void sendNotification(String message);
}

abstract class LibraryMember{
	protected int memberId;
	protected String name;
	public int bookCount;
	
	
	LibraryMember(int memberId, String name){
		this.memberId=memberId;
		this.name = name;
		this.bookCount = 0;
	}
	
	public abstract void BorrowBook(Book book);

	public void sendNotification(String message){
		System.out.println("Notification sent to "+name+": " + message);
	}
	
		
}

class StudentMember extends LibraryMember implements Notifyable{
	private int limit = 3;
	private Book[] book;

//	public int bookCount=0;
	

	
	StudentMember(int memberId, String name){
		super(memberId, name);
		this.book = new Book[limit];
	}
	
	public void BorrowBook(Book books){
		if(bookCount<= book.length){
			this.book[bookCount]= books;
			bookCount++;
			
		}else{
			System.out.println("Book borrowing limit over");
		}

		
	}
	

	

}

class FacultyMember extends LibraryMember implements Notifyable{
	private int limit = 5;
	private Book[] book;
// 	public int bookCount = 0;
	

	
	FacultyMember(int memberId, String name){
		super(memberId, name);
		this.book = new Book[limit];
	}
	
	public void BorrowBook(Book books){
		if(bookCount<= book.length){
			this.book[bookCount]= books;
			bookCount++;
			
		}else{
			System.out.println("Book borrowing limit over");
		}
		

}

}

class Q30{
	public static void main(String[] args){
		
		Book b1 = new Book(1, "alice in wonderland", "ABC");
		Book b2 = new Book(2, "altomic habits", "HHH");		
		Book b3 = new Book(3, "belive in me", "ABC");
		Book b4 = new Book(4, "nevver give up", "XYZ");		
		
		LibraryMember l1 = new StudentMember(100, "Harshal");
		LibraryMember l2 = new FacultyMember(300, "Amit");
		
		l1.BorrowBook(b1);
		l1.BorrowBook(b4);
		
		System.out.println("StudentMember "+l1.name+" borrowed "+l1.bookCount+" books");

		l2.BorrowBook(b1);
		l2.BorrowBook(b3);
		l2.BorrowBook(b2);
		System.out.println("FacultyMember "+l2.name+" borrowed "+l2.bookCount+" books");
		
		
		l1.sendNotification("Return books within 7 days");
		l2.sendNotification("Return books within 14 days");


	}
}
