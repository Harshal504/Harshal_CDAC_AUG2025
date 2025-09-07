//Vehicle Types
//Scenario: Vehicles can be Land or Water types. Some vehicles can operate on both.
//Problem Statement:
//● Interface LandVehicle → method driveOnLand()
//● Interface WaterVehicle → method driveOnWater()
//● Class AmphibiousVehicle implements both interfaces → provides both methods
//Sample Input: AmphibiousVehicle → name=HydroCar
//Sample Output: HydroCar → Driving on Land HydroCar → Driving on Water


import java.util.*;


interface LandOnVehicle{

	public void driveOnLand();

}

interface WaterVehicle{
    public void driveOnWater();
}

class AmphibiousVehicle implements LandOnVehicle, WaterVehicle{
	private String name;
	
	AmphibiousVehicle(String name){
		this.name=name;
	}
	

	public void driveOnLand(){
		System.out.println(name+" → Driving on Land");
	}
	

	public void driveOnWater(){
		System.out.println(name+" → Driving on Water");
	}
}



class Q22{
	public static void main(String[] args){
		
		AmphibiousVehicle av= new AmphibiousVehicle("HydroCar");
		
		av.driveOnLand();
		av.driveOnWater();
		


	}
}