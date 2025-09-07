//Temperature Sensor
//Scenario: Sensor should only accept temperatures in safe range.
//Problem Statement: Create a class TemperatureSensor with private temperature. Setter validates range 0–100°C.
//Fields:
//● private int temperature
//Methods:
//● setTemperature(int t) → only 0–100 valid
//● getTemperature() → return temperature
import java.util.*;

class TemperatureSensor{
	private int temperature;
	
	void setTemperature(int t){
		if(t>=0 && t<=100){
			this.temperature=t;
		}else{
			System.out.println(" Invalid temperature ");
		}
	}
	
	int getTemperature(){
		return temperature;
	}

	
}



class Q5{
	public static void main(String[] args){
		
		TemperatureSensor ts= new TemperatureSensor();
		ts.setTemperature(100);
		
		System.out.println(ts.getTemperature());
		
		

	}
}