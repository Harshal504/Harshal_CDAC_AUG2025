//Count the total number of nodes in a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30, 40]
//Expected Output: Total nodes: 4

import java.util.*;
import java.lang.*;

class Q18{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data =d;
			next= null;
		}
	}
	
	static void getLength(){
		Node curr =head;
		int index = 0;
		while(curr!=null){
			curr=curr.next;
			index++;
		}
		System.out.println("Total nodes "+ index);
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

		Q18.head=new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		getLength();

        }
}