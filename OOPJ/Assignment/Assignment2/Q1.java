//Counter for Cups
//Scenario: You are keeping track of how many cups of tea are prepared in your home.
//Requirements:
//1. Create a class TeaCup with instance variable: teaType (String).
//2. Create a static variable totalCups to count all cups created.
//3. Constructor should initialize teaType and increment totalCups.
//4. Create getter for teaType.
//5. Create a static method showTotalCups() to print total cups
import java.util.*;


class TeaCup{

	String teaType;
	static int totalCups = 0;
	
	TeaCup(String teaType){
		this.teaType = teaType;
		this.totalCups++;
	}
	
	void getteaType(){
		System.out.println("Cup1 type:"+ this.teaType);
	}
	
	static void showTotalCups(){
		System.out.println("Total Cups made: "+ totalCups );
	}

}

class Q1{
	public static void main(String args[]){
		TeaCup tc1 = new TeaCup("Masala Tea");
		tc1.getteaType();
		TeaCup tc2 = new TeaCup("Green Tea");
		tc2.getteaType();
		TeaCup tc3 = new TeaCup("Ginger Tea");
		tc3.getteaType();
		TeaCup.showTotalCups();
		
	}
}