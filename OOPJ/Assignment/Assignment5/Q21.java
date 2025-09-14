//Problem 21: Text Editor Undo System
//Use Case: Implement undo functionality for a text editor.
//Requirements:
//● Track user actions in order
//● Implement undo operation (LIFO)
//● Display current action history
//Sample Input:
//Actions: "Type A", "Type B", "Delete"
//Operation: Undo last action
//Expected Output:
//Current actions: Type A, Type B

import java.util.*;
import java.util.Map.Entry;


class Q21{
	
	public static void undo(Stack editor){
		if(!editor.isEmpty()){
			editor.pop();
		}
	}
	


	public static void main(String[] args){
		Stack<String> editor = new Stack<String>();
		
		editor.push("Type A");
		editor.push("Type B");
		editor.push("Delete");
		
		Q21.undo(editor);
		
		System.out.println(editor);
		
		for(String s:editor){
			System.out.println(s);
		}

		
		
		
		
		
	
	}

}