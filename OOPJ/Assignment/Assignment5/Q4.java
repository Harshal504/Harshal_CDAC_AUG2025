//Problem 4: Grocery Shopping List
//Use Case: A person maintains a grocery list and removes items as they purchase them.
//Requirements:
//● Add items to grocery list
//● Remove purchased items
//● Display remaining items
//Sample Input:
//Add items: "Milk", "Eggs", "Bread"
//Purchase: "Milk"
//Expected Output:
//Items to buy: Eggs, Bread

import java.util.*;


class Q4{
	
	public static void addItems(Set<String> grocery, String item){
		grocery.add(item);
	}
	
	public static void purchaseItem(Set<String> grocery, String item){
		grocery.remove(item);
	}

	public static void main(String[] args){
		Set<String> grocery = new HashSet<String>();
		
		Q4.addItems(grocery, "Milk");
		Q4.addItems(grocery, "Eggs");
		Q4.addItems(grocery, "Bread");

		
		Q4.purchaseItem(grocery, "Milk");
		
		for(String g : grocery){
			System.out.println(g);
		}
		
	}

}