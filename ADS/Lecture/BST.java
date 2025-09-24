


class BST{
	
	Node root;
	
	static class Node{
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		left = right = null;
	}
	}
	
	BST()
	{
		root = null;
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
	void insert(int key){
		root = insertdata(root,key);
	}
	
	Node insertdata(Node root, int key){
		if (root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key < root.data)
			root.left = insertdata(root.left, key);
		else if(key > root.data)
			root.right = insertdata(root.right, key);
			return root;
		
		
		
		
	}
	
	
	
    public static void main(String[] args)
	{
		BST t1= new BST();
		t1.insert(50);
		t1.insert(47);
		t1.insert(34);
		t1.insert(61);
		t1.insert(72);
		t1.insert(91);
		t1.insert(49);
		t1.insert(11);
		t1.insert(51);
		
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
