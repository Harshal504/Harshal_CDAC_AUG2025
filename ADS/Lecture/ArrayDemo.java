class Array{
	private int[] a1;
	private int n;
	
	public Array(int max){
		a1 = new int[max];
		n = 0;
	}
	
	void display(){
		for(int j=0;j<n;j++){
			System.out.print(a1[j] + " ");
		}
	}
	
	void insert(int value){
		a1[n] = value;
//		n is total items in array;
		n++;
//		System.out.println(n);
	}
	
	boolean search(int key){
		int j;
		for(j=0;j<n;j++){
			if(a1[j] == key){
				
				break;
			}
		}
		
		if(j==n)
			return false;
		else
			return true;
	}	
	
	boolean delete(int value){
		//step 1: identify index for 44
		int j;
		//search in array
		for(j=0;j<n;j++){
			//condition true: value mil gaya hai, aur loop se nbahar
			if(a1[j] == value){//check key = array element same or not
				
				break;
			}
		}
		//step 2: element doesnot exit in array
		if(j == n)
			return false;
		//Element exist: deletion process initiate
		else{
		//Step 3 : shifting af an array elements
		for(int k = j;k<n-1;k++){
			a1[k] = a1[k+1];
		}
		//Array length update karenge	
		n--;
		return true;
		}
		
	}
}


class ArrayDemo{
	
	
    public static void main(String[] args) {
		
		int size =100;
		Array a = new Array(size);
		
		//Insertion in array
		a.insert(22);
		a.insert(33);
		a.insert(44);
		a.insert(22);
		a.insert(77);
		a.insert(22);
		a.insert(99);
		a.insert(0);
		a.insert(55);
		
		//Traverse an array
		a.display();
		 System.out.println();
		 
		//search operation in array
		boolean x = a.search(91);
		if(a.search(91))
			System.out.println("Search Result: Found!!!");
		
		else
			System.out.println("Search Result: Not Found!!!");
//		 System.out.println();
		//Deletion
	   boolean del = a.delete(55);
	   if(del)
		   System.out.println(" 44 deleted successfully!!!");
	   else
		   System.out.println(" Not found!!!");
//	    System.out.println();
//	   a.display();
    }
 }
