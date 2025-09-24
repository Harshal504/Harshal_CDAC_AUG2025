


class LL3{
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
	
	void insert(int new_data){
	Node new_node = new Node(new_data);
	new_node.next = head;
	head = new_node;
	
	
	}
	
	
    public static void main(String[] args) {
		//Reference for LL generation
		LL3 l1 = new LL3();
		
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
		//-----------------
		System.out.println();
		l1.insert(5);
		l1.display();
		//-----------------
		System.out.println();
		l1.insert(55);
		l1.display();
		//-----------------
		System.out.println();
		l1.insert(65);
		l1.display();
		
		
    }
 }
