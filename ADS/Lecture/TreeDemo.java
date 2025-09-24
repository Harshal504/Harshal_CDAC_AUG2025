



class TreeDemo{
	
	Node root;
	
	static class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
	}
	TreeDemo(){
		root = null;
	}
	
	TreeDemo(int d){
		root = new Node(d);
	}
	
	
    public static void main(String[] args)
	{
		TreeDemo t1 = new TreeDemo();
		t1.root = new Node(20);
		t1.root.left = new Node(25);
		t1.root.right = new Node(56);
		t1.root.left.left = new Node(15);
		t1.root.left.right = new Node(31);
		
		
		
		
    }
    
 
}

		