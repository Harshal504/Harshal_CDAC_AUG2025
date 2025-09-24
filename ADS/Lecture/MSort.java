
class MSort{
	
	static void mergesort(int arr[], int l, int r)
	{
		if(l<r){
			int mid = (l+(r-l)/2);
			mergesort(arr, l, mid);//Left part
			mergesort(arr, mid+1, r);//Right part
			merge(arr, l, mid, r);//Merging of an Left and right array
			
		}
	}
	
	static void merge(int arr[], int l, int mid, int r){
		int n1 = mid-l+1;
		int n2 = r - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			L[i] = arr[l+i];
		
		for(int j=0;j<n2;j++)
			R[j] = arr[mid+1+j];
		
		int i=0, j=0;
		int k=l;
		
		while(i<n1 && j<n2){
			if(L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1){
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2){
			arr[k] = R[j];
			j++;
			k++;
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
		MSort b1 = new MSort();
		int arr[] = {44,77,22,99,11,55,66,33};
		
		int n = arr.length;
		
		System.out.println("Merge sort : UnSorted array");
		b1.display(arr);
		
		mergesort(arr,0, n-1);
		
		System.out.println("Merge sort : Sorted array");
		b1.display(arr);
	
		
    }
    
 
}
