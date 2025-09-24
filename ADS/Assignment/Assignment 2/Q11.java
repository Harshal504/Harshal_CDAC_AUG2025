//Create a LinkedList and insert elements at the end.
//Testcase:
//Existing LinkedList: [5, 10, 15]
//Elements to insert: [20, 25]
//Expected Output: LinkedList: 5 → 10 → 15 → 20 → 25


import java.util.*;
import java.lang.*;

class Q11{
	static Node head;
	static class Node{
	    int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
		
	}
	
	static void insertEnd(int d){
			Node newNode = new Node(d);
			if(head==null){
				head = newNode;
			}else{
				Node curr = head;
				while(curr.next!=null){
					curr=curr.next;
				}
				curr.next = newNode;
			}
			
		}
		
		static void display(){
			Node curr = head;
			while(curr!=null){
				System.out.print(curr.data+" ");
				curr=curr.next;
			}
		}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Node n = new Node(10);
		head = n;
		
		Q11.insertEnd(20);
		Q11.insertEnd(31);
		Q11.insertEnd(47);
		
		Q11.display();
		

	
        }
}