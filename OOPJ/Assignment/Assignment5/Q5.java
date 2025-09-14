//Problem 5: Recent Search History
//Use Case: A search application maintains the last 5 searches, removing the oldest when the limit is exceeded.
//Requirements:
//● Store recent searches (maximum 5)
//● Remove oldest search when limit exceeded
//● Maintain insertion order
//Sample Input:
//Searches: "Java", "Python", "C++", "DSA", "OOP", "Spring"
//Expected Output:
//Recent searches: Python, C++, DSA, OOP, Spring

import java.util.*;


class Q5{
	
	public static void searchword(Queue<String> search, String word){
		if(search.size()<5){
			search.add(word);
		}else{
			search.poll();
			search.add(word);
			
		}
	}


	public static void main(String[] args){
		Queue<String> search = new LinkedList<String>();
		
		searchword(search, "Java");
		searchword(search, "Python");
		searchword(search, "C++");

		searchword(search, "DSA");

		searchword(search, "OOP");

		searchword(search, "Spring");
		
		for(String s: search){
			System.out.println(s);
		}

		
	}

}