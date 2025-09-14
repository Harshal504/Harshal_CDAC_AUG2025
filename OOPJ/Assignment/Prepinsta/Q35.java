//Decimal to Binary conversion : divide by 2 take remainders and concatinate




import java.util.Scanner;
import java.lang.Math;

class Q35{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		
		int num = sc.nextInt();
		int temp = num;
		String s ="";
		while(temp>0){
			//System.out.println(temp%2);
			s=temp%2+s;
			temp /=2;
		}
		temp = Integer.valueOf(s);
		System.out.println(temp);
	
	
	
	}

}