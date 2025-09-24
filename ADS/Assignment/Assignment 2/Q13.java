//Insert a new node at a given position in a LinkedList.
//Testcase:
//Existing LinkedList: [10, 20, 30, 40]
//Node to insert: 25 at position 2
//Expected Output: LinkedList: 10 → 20 → 25 → 30 → 40


import java.util.*;
import java.lang.*;

class Q13{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data =d;
			next= null;
		}
	}
	
	static int getdata(int key){
		Node curr = head;
		
		for(int i=0;i<key-1;i++){
			curr = curr.next;
		}
		
		return curr.data;
		
	}
	
	static void insert(int d, int key){
		Node newNode = new Node(d);
		Node curr = head;
		int p = getdata(key);
		while(curr!=null){
			if(curr.data==p){
				newNode.next=curr.next;
				curr.next=newNode;
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

		Q13.head=new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		display();
		insert(25,2);
		
//		System.out.println(getdata(2));
		display();

        }
}