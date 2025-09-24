


class BS{
	
	static int bsearch(int arr[], int x, int l, int h){
		
		if(h >=l){
			int mid = l+(h) / 2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] > x){
			return bsearch(arr, x,l, mid-1);
			}else{
			return bsearch(arr, x,mid+1,h);}
		}
		return -1;
		
		
	}
    public static void main(String[] args) {
		
		
		int arr[] = {2,5,8,11,16,47,59,78};
		
//		search elemnt
		int x = 59;
//		arr length
		int n = arr.length;
		
//		binary search method
//       bseach(array, seach element, lower index,  higher index)

		int result = bsearch(arr, x, 0, n-1);
		if(result == -1)
			System.out.println("Nahi mila !!!");
		else
			System.out.println("Balle Balle !!!");
		
    }
 }
