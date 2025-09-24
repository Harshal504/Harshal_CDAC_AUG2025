


class DLL1{
	Node head;//head start ptr of DLL
	
	static class Node{
	//data value, 2 references next & prev
	int data;
	Node next;
	Node prev;
	
	//DLL Node value initialization
	Node(int d){
		data = d;
		next = prev = null;
		
	}
	}
	
	void display(){
		Node n = head;
		while(n != null){
			System.out.print(n.data+"<--->");
			n=n.next;
		}
		
	
	}
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null)
				head.prev = new_node;
		head = new_node;
		
		
	}
	

    public static void main(String[] args) {
		DLL1 d1 = new DLL1();
		d1.insert(30);//30
		d1.display();
		System.out.println();
		
		d1.insert(20);//20 30
		d1.display();
		System.out.println();
		
		d1.insert(10);//10 20 30
		d1.display();
		System.out.println();
		
		
    }
    
 
}
