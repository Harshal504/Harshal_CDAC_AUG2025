//Problem 6: Age Restriction
//Scenario: A professional workshop registration system only allows participants who are 18 years or older. The system needs a custom exception for age validation.
//Task: Create a custom exception class and use it to validate user age during registration.
//Sample Input:
//16
//Expected Output:
//AgeNotValidException: Age must be ≥ 18


class AgeRestriction extends Exception{
	AgeRestriction(String name){
		super(name+" AgeNotValidException: Age must be ≥ 18");
	}
}		

class Q6{

	static void registration(String name, int age) throws AgeRestriction{
		
		if(age<18){
			throw new AgeRestriction(name);
		}
		System.out.println("Name: "+name+" Age: "+age);
		
	}
	
	public static void main(String[] args) {
		
		try{
			registration("Harshal", 27);
			registration("rohit", 17);
		}catch(AgeRestriction e){
			System.out.println(e.getMessage());
		}
		

	}
}