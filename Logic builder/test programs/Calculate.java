import java.util.Scanner;
class Find{
	public static void main (String args[]){
		
		int l,h;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter Length of Rectangle in meter");
		l = sc.nextInt();
		System.out.println(" Please Enter Height of Rectangle in meter");
		h = sc.nextInt();
		
		int area = l*h;		
		System.out.println("Area of the Rectangle is "+area+" SqM");
		
	
	}
}