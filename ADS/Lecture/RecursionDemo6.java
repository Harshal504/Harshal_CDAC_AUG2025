


class RecursionDemo6{
	
	
	static void toh(int n,char source, char auxillary, char destination){
		if(n == 1)
			System.out.println("Disk from "+s +" to" + d );
		else{
			toh(n-1,s,d,a);
			System.out.println("Disk from "+s +" to" + d );
			toh(n-1,a,s,d);
		}
	
	}
	
    public static void main(String[] args) {
		
		final int n = 4;
			
		toh(n,'A','B','C');
		
		
	   
    }
 }
