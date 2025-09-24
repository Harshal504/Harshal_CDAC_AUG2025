


class LL5{
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
	
	void insertAfter(Node prev_node, int new_data){
		if(prev_node == null ){
			System.out.println("prev_node cannot be null");
			return;
			}
			
			Node new_node = new Node(new_data);
			new_node.next = prev_node.next;
			prev_node.next = new_node;
			
	}
	
	void append(int new_data){
	 Node new_node = new Node(new_data);
	 //LL is empty
	 if(head == null){
		head = new Node(new_data);
		return;
	}
	new_node.next = null;
	Node last = head;
	while(last.next != null){
		last = last.next;
	}
	last.next = new_node;
	
	}
	
	
    public static void main(String[] args) {
		//Reference for LL generation
		LL5 l1 = new LL5();
		
		//-----------------
		System.out.println();
		l1.append(41);
		l1.display();//41
		
		//-----------------
		System.out.println();
		l1.insert(5);
		l1.display();//5 
		//-----------------
		System.out.println();
		l1.insert(55);
		l1.display();//55 5 
		//-----------------
		System.out.println();
		l1.insert(65);
		l1.display();//65 55 5 
		
		//-----------------
		System.out.println();
		l1.insertAfter(l1.head.next, 75);
		l1.display();//65 55 5 
		
		//-----------------
		System.out.println();
		l1.insertAfter(l1.head, 77);
		l1.display();//65 77 55 75 5 
		
		//-----------------
		System.out.println();
		l1.insertAfter(l1.head.next.next, 87);
		l1.display();//65 77 55 75 5 
		
		//-----------------
		System.out.println();
		l1.append(44);
		l1.display();//65 77 55 75 5 
    }
    
 }
