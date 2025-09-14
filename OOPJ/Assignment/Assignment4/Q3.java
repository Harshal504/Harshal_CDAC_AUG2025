//Problem 3: Age Input
//Scenario: A registration form for an online course asks for the user's age. Sometimes users accidentally enter text instead of numbers, causing the system to crash.
//Task: Create a registration system that safely converts age input from string to integer.
//Sample Input:
//eighteen
//Expected Output:
//Invalid number format


	
	

class Q3{
	
	static void user(String n, String a){
		try{
		String name=n;
		int age = Integer.valueOf(a);
		System.out.println("Name: "+name+" Age: "+age);

		}catch(NumberFormatException e){
//			int age = Integer.valueOf(a);
			System.out.println("Invalid number format");
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Q3.user("Harshal","27");
		Q3.user("Rohit","Three");
		
	
	}
}