


class LS{
	
	static int search(int arr[], int x){
		
		int n = arr.length;
		for(int i=0;i<n;i++){
			if(arr[i] == x)
				return i;
		}
		return -1;
		
	}
    public static void main(String[] args) {
		
		int arr[] = {2,5,8,11,16,47,9,78};
		int x = 147;
		
		
		int result = search(arr, x);
		if(result == -1)
			System.out.println("Nahi mila !!!");
		else
			System.out.println("Balle Balle !!!");
		
    }
 }
