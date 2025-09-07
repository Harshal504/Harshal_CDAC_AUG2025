//Vehicle Types
//Scenario: You want to categorize vehicles.
//Problem Statement: Create a superclass Vehicle with brand, speed. Create subclasses Car and Bike with additional modelType. Display details of each vehicle.
//Classes/Fields:
//● Vehicle → brand, speed
//● Car → modelType
//● Bike → modelType


import java.util.*;

abstract class Vehicle{

	protected String brand;
	protected int speed;
	
	Vehicle(String brand, int speed){
		this.brand=brand;
		this.speed=speed;
	}
	
	abstract void display();
	

}

class Car extends Vehicle{
	private String modelType;
	
	Car(String brand, int speed, String modelType){
		super(brand,speed);
		this.modelType=modelType;
	}
	@Override
	void display(){
		System.out.println("Car -> "+brand+" "+modelType+" Speed= "+ speed);
	}
	
}

class Bike extends Vehicle{

	private String modelType;
	
	Bike(String brand, int speed, String modelType){
		super(brand,speed);
		this.modelType=modelType;
	}
	@Override
	void display(){
		System.out.println("Bike -> "+brand+" "+modelType+" Speed= "+ speed);
	}	
	

}




class Q8{
	public static void main(String[] args){
		
		Vehicle v1 = new Car("Honda", 180, "civic");
		Vehicle v2 = new Bike("Yamaha", 220, "FZS");
		
		v1.display();
		v2.display();


	}
}