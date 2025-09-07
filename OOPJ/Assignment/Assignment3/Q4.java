//Library Book Availability
//Scenario: A library wants to keep track of available copies without letting external code change it directly.
//Problem Statement: Create a class Book with private copiesAvailable. Provide getter/setter to update or read copies.
//Fields:
//● private int copiesAvailable
//Methods:
//● addCopies(int n) → add copies
//● removeCopies(int n) → subtract if enough copies
//● getCopiesAvailable() → return current copies
import java.util.*;

class Book{
	private int copiesAvailable;
	
	void setCopiesAvailable(int copiesAvailable){
		this.copiesAvailable= copiesAvailable;
	}
	
	int getCopiesAvailable(){
		return copiesAvailable;
	}
	
	void addCopies(int copies){
		copiesAvailable += copies;
	}
	
	void removeCopies(int copies){
		if(copies<=copiesAvailable){
			copiesAvailable -= copies;
		}else{
			System.out.println("not enough copies invalid entry");
		}
	}
	
}



class Q4{
	public static void main(String[] args){
		Book b1 = new Book();
		
		b1.setCopiesAvailable(200);
		System.out.println("Copies Availabe: " +b1.getCopiesAvailable);
		
		b1.addCopies(180);
		
		b1.removeCopies(381);
		System.out.println("Copies Availabe: " +b1.getCopiesAvailable);
		
		
				
	

	}
}