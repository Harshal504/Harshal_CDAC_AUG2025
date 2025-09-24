


class LL2{
	//starting of LL : head ptr
	Node head;

	//To design node setup
	static class Node{
		//Sections of node
		int data;
		Node next;
		
		//constructor to initalize values in node
		Node(int d){
		data = d;
		next = null;//null : no previous data
		}
	}
	
	void display(){
		Node n = head;//starting point of LL
		while(n != null){
			System.out.print(n.data+" ---> ");
			n = n.next;
		}
		
		
	}
	
	
    public static void main(String[] args) {
		//Reference for LL generation
		LL2 l1 = new LL2();
		
		//created first node with 11 value
		l1.head = new Node(11);
		//created second node with 22 value
		Node second = new Node(22);
		//created third node with 33 value
		Node third = new Node(33);
		
		//Build connections between nodes
		l1.head.next = second;
		second.next = third;
		
		l1.display();
		
		
    }
 }
