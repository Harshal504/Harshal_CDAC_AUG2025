


class TreeDemo1{
	
	Node root;
	
	static class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
	}
	TreeDemo1(){
		root = null;
	}
	
	TreeDemo1(int d){
		root = new Node(d);
	}
	
	//Inorder: LC, Root, RC
	void inorder(Node n){
		if(n == null)
			return;
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);
		
		
	}
	//Preorder: Root, LC, RC
	void preorder(Node n){
		if(n == null)
			return;
		
		System.out.print(n.data + " ");
		preorder(n.left);
		preorder(n.right);
		
		
	}
	
	//Postorder: LC, RC, Root, 
	void postorder(Node n){
		if(n == null)
			return;
		
		
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data + " ");
		
		
	}
	
    public static void main(String[] args)
	{
		TreeDemo1 t1 = new TreeDemo1(111);
		//t1.root = new Node(20);
		t1.root.left = new Node(25);
		t1.root.right = new Node(56);
		t1.root.left.left = new Node(15);
		t1.root.left.right = new Node(31);
		
		System.out.println("Inorder:");
		t1.inorder(t1.root);
		System.out.println();
		
		System.out.println("Preorder:");
		t1.preorder(t1.root);
		System.out.println();
		
		System.out.println("Postorder:");
		t1.postorder(t1.root);
		
		
		
		
    }
    
 
}
