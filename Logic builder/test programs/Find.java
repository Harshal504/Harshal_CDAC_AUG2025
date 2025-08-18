import java.util.Scanner;
class Find{
	public static void main (String args[]){
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter 3 numbers separately");
		a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
		
		int temp = a;
		if(temp<b){
			temp = b;
		}
		if(temp<c){
			temp=c;
		}
		
	    System.out.println("Largest no out of three numbers is " + temp);
		
	
	}
}