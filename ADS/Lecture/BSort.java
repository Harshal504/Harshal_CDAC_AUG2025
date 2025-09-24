
class BSort{
	
	void bSort(int arr[]){
		int n = arr.length;
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
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
		BSort b1 = new BSort();
		int arr[] = {44,77,22,99,11,55,66,33};
		System.out.println("Bubble sort : UnSorted array");
		b1.display(arr);
		
		b1.bSort(arr);
		
		System.out.println("Bubble sort : Sorted array");
		b1.display(arr);
	
		
    }
    
 
}
