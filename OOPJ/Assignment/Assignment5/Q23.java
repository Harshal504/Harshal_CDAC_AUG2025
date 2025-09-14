//Problem 23: Browser History Management
//Use Case: Maintain browser history with back functionality.
//Requirements:
//● Store visited pages
//● Implement back navigation (LIFO)
//● Display current history
//Sample Input:
//Pages visited: "Google", "YouTube", "GFG"
//Action: Back (1 page)
//Expected Output:
//Current history: Google, YouTube

import java.util.*;
import java.util.Map.Entry;


class Q23{
	

	static <T> void back(Stack<T> pages){
		pages.pop();
		for(T s: pages){
			System.out.println(s);
		}
	}


	public static void main(String[] args){
		Stack<String> pages = new Stack<>();
		
		pages.push("Google");
		pages.push("Youtube");
		pages.push("GFG");
		
		Q23.back(pages);
		
		
		
	
	}

}