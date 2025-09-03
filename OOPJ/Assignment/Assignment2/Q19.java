//Vehicle Registration – Static Counter
//Scenario: Create Vehicle class with regNo, ownerName, vehicleType.
//● Static variable: vehicleCount
//● Constructor → auto-generate regNo as "MH-2025-" + vehicleCount
//● Getter methods for all fields
//Create 2 vehicles, display registration details
//Entend Vehicle Registration – Static Block
//Scenario: Add a static block to Vehicle class:
//● Print "Welcome to CDAC Vehicle Registration Portal" when class loads
//● Verify that the message prints only once when multiple vehicles are created
import java.util.*;
class Vehicle{
	String regNo;
	String ownerName;
	String vehicleType;
	static int vehicleCount = 100;
	static{
		System.out.println("Welcome to CDAC Vehicle Registration Portal" );
	}
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		vehicleCount++;
		this.regNo = "MH-2025-"+ vehicleCount;
	}
	
	String getownerName(){
		return ownerName;
	}
	
	String getvehicleType(){
		return vehicleType;
	}
	
	String getregNo(){
		return regNo;
	}
	

}


class Q19{
	public static void main(String args[]){
		Vehicle v1 = new Vehicle("Harshal", "Honda");
		Vehicle v2 = new Vehicle("Rohit", "Yamaha");
		
		System.out.println("Registration no: "+v1.getregNo()+" Owner Name: "+v1.getownerName()+" Vehicle Type: "+v1.getvehicleType());
		System.out.println("Registration no: "+v2.getregNo()+" Owner Name: "+v2.getownerName()+" Vehicle Type: "+v2.getvehicleType());
		
		
		
}
}