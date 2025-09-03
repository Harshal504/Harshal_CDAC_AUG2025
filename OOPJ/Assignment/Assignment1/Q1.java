import java.util.*;

class Q2{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter score for Test1 : ");
		int t1 = sc.nextInt();
		System.out.println("Enter score for Test2 : ");
		int t2 = sc.nextInt();
		
		System.out.println(t1 > t2 ? "Test1 has higher score" : "Test2 has higher score");
		
	}

}
