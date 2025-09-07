//Vehicle Speed Display
//Scenario: Vehicle management system needs to display speed differently for different vehicle types.
//Problem Statement: Create class Vehicle with method displaySpeed(). Subclass Car and Bike override it.
//Classes/Fields:
//● Vehicle → displaySpeed() prints “Vehicle speed unknown”
//● Car → overrides displaySpeed() → “Car speed 120 km/h”
//● Bike → overrides displaySpeed() → “Bike speed 80 km/h”
//Sample Input: Car Bike
//Sample Output: Car speed 120 km/h Bike speed 80 km/h


import java.util.*;
import java.lang.Math;

class Vehicle{

	void displaySpeed(){
		System.out.println("Vehicle speed unknown");
	}
	
}

class Car extends Vehicle{
	@Override
	void displaySpeed(){
		System.out.println("Car speed 120 km/h");
	}}


class Bike extends Vehicle{
	@Override
	void displaySpeed(){
		System.out.println("Bike speed 80 km/h");
	}}
	
class Q17{
	public static void main(String[] args){
		
		Vehicle v = new Vehicle();
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		
		v.displaySpeed();
		car.displaySpeed();
		bike.displaySpeed();


	}
}