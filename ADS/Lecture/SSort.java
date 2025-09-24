
class SSort{
	
	void sSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			int min = i;
			for(int j=i+1; j<n;j++){
				if(arr[j] < arr[min])
					min = j;
				
				
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
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
		SSort b1 = new SSort();
		int arr[] = {44,77,22,99,11,55,66,33};
		System.out.println("Selection sort : UnSorted array");
		b1.display(arr);
		
		b1.sSort(arr);
		
		System.out.println("Selection sort : Sorted array");
		b1.display(arr);
	
		
    }
    
 
}
