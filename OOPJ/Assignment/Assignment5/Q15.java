//Problem 15: Library Book Inventory
//Use Case: Track available copies of books in a library system.
//Requirements:
//● Map book titles to available copies
//● Update copies when books are borrowed
//● Display current inventory
//Sample Input:
//Initial inventory: "Java" → 3, "Python" → 5
//Borrow: "Java" (1 copy)
//Expected Output:
//Current inventory: Java:2, Python:5

import java.util.*;
import java.util.Map.Entry;


class Q15{
	
	public static void borrow(Map<String, Integer> books, String book, int quantity){
		books.replace(book, books.get(book)-quantity);
	}
	
	public static void deposit(Map<String, Integer> books, String book, int quantity){
		books.replace(book, books.get(book)+quantity);
	}


	public static void main(String[] args){

		Map<String, Integer> books = new HashMap<>();
		
		books.put("Java", 3);
		books.put("Python", 5);
		
		Q15.borrow(books, "Java", 1);
		
		Set<Entry<String,Integer>> s = books.entrySet();
		
		for(Entry<String,Integer> a : s){
			System.out.println(a);
		}
		
		Q15.deposit(books,"Python",2);
		for(Entry<String,Integer> a : s){
			System.out.println(a);
		}
	
	}

}