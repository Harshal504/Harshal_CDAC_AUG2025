
class ISort{
	
	void iSort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key){
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		
	
	}
	
	void display(int arr[]){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
		
    public static void main(String[] args)
	{
		ISort b1 = new ISort();
		int arr[] = {44,11,77,44,99,11,55,66,33};
		System.out.println("Insertion sort : UnSorted array");
		b1.display(arr);
		
		b1.iSort(arr);
		
		System.out.println("Insertion sort : Sorted array");
		b1.display(arr);
	
		
    }
    
 
}
