import java.util.Scanner;

class Scanclass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name, age and Height");
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		int height = sc.nextInt();
		
		System.out.println("Hello "+ name+" your age is "+age+" and height is "+height);
		 
		
	}
}