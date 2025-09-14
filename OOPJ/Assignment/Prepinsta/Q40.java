//Quadrants in which a given coordinate lies



import java.util.Scanner;
import java.lang.Math;

class Q40{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  coordinates x and y");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(x>0 && y >0 ? "Quadrant 1" :
								x>0 && y <0 ? "Quadrant 2" :
									x<0 && y <0 ? "Quadrant 3" :
										x<0 && y >0 ? "Quadrant 4" :
											"On Axis");

	
	
	
	}

}