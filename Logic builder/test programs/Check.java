import java.util.Scanner;
class Check{
	public static void main (String args[]){
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please enter the number");
		n = sc.nextInt();
		
		if(n%2 == 0){
			System.out.println(n + " is a Even number");
		}else{
			System.out.println(n + " is a Odd number");
		}
	
	}
}