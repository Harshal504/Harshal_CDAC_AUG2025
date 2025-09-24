//Insert a new node at the beginning of a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30]
//Node to insert: 5
//Expected Output: LinkedList: 5 → 10 → 20 → 30


import java.util.*;
import java.lang.*;

class Q12{
	
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			next=null;
		}
	}
	
	static void insertBegning(int d){
		Node newNode = new Node(d);
		newNode.next = head;
		head = newNode;
	}
	
	static void display(){
		Node curr = head;
		while(curr.next!=null){
			System.out.print(curr.data +" -> ");
			curr = curr.next;
		}
		System.out.println(curr.data);
	}

	public static void main(String[] args){

		Q12.head=new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		
		Q12.display();
		
		Q12.insertBegning(5);
		
		Q12.display();
	
        }
}