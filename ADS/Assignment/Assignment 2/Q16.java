//Delete a node by its value in a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30, 40]
//Node to delete: 30
//Expected Output: LinkedList: 10 → 20 → 40


import java.util.*;
import java.lang.*;

class Q16{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data =d;
			next= null;
		}
	}
	

	
	static void delete(int d){
		Node curr = head;
		if(curr.data ==d){
			head=curr.next;
			return;
		}
		while(curr.next!=null){
			if(curr.next.data==d){
				curr.next =curr.next.next;
				break;
			}
			curr=curr.next;
		}
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

		Q16.head=new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		display();
		delete(10);
		
//		System.out.println(getdata(2));
		display();

        }
}