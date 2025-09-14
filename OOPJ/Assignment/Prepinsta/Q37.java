//Decimal to Hexadecimal Conversion : divide by 16 take remainders and if greater than 9 add 55 and downcast by char concatinate




import java.util.Scanner;
import java.lang.Math;

class Q37{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		
		int num = sc.nextInt();
		int temp = num;
		String s ="";
		while(temp>0){
			if(temp%16<=9){
			s=temp%8+s;
			}else{
			s=((char)(55+(temp%16)))+s;
			
			}
			temp /=16;
		}
//		temp = Integer.valueOf(s);
		System.out.println(s);
	
	
	
	}

}