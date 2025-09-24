//Search for an element in a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30, 40]
//Element to search: 30
//Expected Output: Element found at index 2


import java.util.*;
import java.lang.*;

class Q17{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data =d;
			next= null;
		}
	}
	
	static void getkey(int d){
		Node curr =head;
		int index = 0;
		while(curr.data!=d){
			curr=curr.next;
			index++;
		}
		System.out.println("Element found at index "+ index);
	}
	


	
	
	static void display(){
		Node curr = head;
		
		while(curr.next!=null){
			System.out.print(curr.data+" -> ");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}


	public static void main(String[] args){

		Q17.head=new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		getkey(30);

        }
}