import java.util.Scanner;
class Greet{
	public static void main (String args[]){
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Whats the time");
		a = sc.nextInt();
		//considering 24 hour format
		if(a>=5 && a<12){
			 System.out.println("Good Morning");
			}
		
	
	}
}