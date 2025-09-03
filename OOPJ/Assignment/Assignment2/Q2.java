//Simple Mobile Tracker
//Scenario: A shop wants to count how many mobiles are added to their inventory.
//Requirements:
//1. Create a class Mobile with instance variable: model (String).
//2. Create a static variable totalMobiles to count total mobiles added.
//3. Constructor should initialize model and increment totalMobiles.
//4. Create a getter for model.
//5. Create a static method showTotalMobiles() to print total mobiles.
import java.util.*;

class Mobile{
	String model;
	static int totalMobiles = 0;
	
	Mobile(String model){
		this.model = model;
		this.totalMobiles++;
	}
	
	void getmodel(){
		System.out.println("Mobile"+totalMobiles+" Model: "+ model);
	}
	
	static void showTotalMobiles(){
		System.out.println("Total mobiles in stock: " + totalMobiles);
	}
	
	
}

class Q2{
	public static void main(String args[]){
		
		Mobile mb1 = new Mobile("Samsung Galaxy M32");
		mb1.getmodel();
		Mobile mb2 = new Mobile("Redmi Note 12");
		mb2.getmodel();
		
		Mobile.showTotalMobiles();
	}
}