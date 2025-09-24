//Reverse a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30, 40]
//Expected Output: LinkedList: 40 → 30 → 20 → 10
//Existing LinkedList: []
//Expected Output: LinkedList: (empty)

import java.util.*;
import java.lang.*;

class Q19{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data =d;
			next= null;
		}
	}
	
	static void reverse(){
		Node curr = head;
		Node temp;
		Node prev=null;
		
		while(curr!=null){
			temp = curr.next;
			curr.next =prev;
			prev=curr;
			curr=temp;
		}
		head=prev;
	}	
	
	static void display(){
		Node curr = head;
		
		while(curr!=null){
			
			System.out.print(curr.data);
			if(curr.next!=null){
				System.out.print(" -> ");
			}
			curr=curr.next;
		}
		System.out.println();
	}


	public static void main(String[] args){

//		Q19.head=new Node(10);
//		head.next = new Node(20);
//		head.next.next = new Node(30);
//		head.next.next.next = new Node(40);
		display();
		reverse();
		display();

        }
}