//Delete the last node of a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30, 40]
//Expected Output: LinkedList: 10 → 20 → 30


import java.util.*;
import java.lang.*;

class Q15{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data =d;
			next= null;
		}
	}
	
//	static int getdata(int key){
//		Node curr = head;
//		
//		for(int i=0;i<key-1;i++){
//			curr = curr.next;
//		}
//		
//		return curr.data;
//		
//	}
	
	static void deleteLast(){
		Node curr = head;
		while(curr.next.next!=null){
			curr=curr.next;
		}
		curr.next=null;
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

		Q15.head=new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		display();
		deleteLast();
		
//		System.out.println(getdata(2));
		display();

        }
}