//Hospital Staff
//Scenario: Hospital has Staff members. Both Doctors and Nurses are Staff.
//Problem Statement:
//● Staff → name, staffId, displayDetails()
//● Doctor → specialization, displayDetails() override
//● Nurse → shift, displayDetails() override
//Sample Input: Doctor → name=Dr. Reddy, staffId=101, specialization=Cardiology Nurse → name=Nisha, staffId=102, shift=Night
//Sample Output: Dr. Reddy → Staff ID=101, Specialization=Cardiology Nisha → Staff ID=102, Shift=Night


import java.util.*;



class Staff {

	protected String name;
	protected int staffID;
	
	Staff(String name, int staffID){
		this.name=name;
		this.staffID=staffID;
	}
	
	void displayDetails(){
		System.out.println(name+" -> Staff ID="+staffID);
	}


}

class Doctor extends Staff{
	private String specialization;
	
	Doctor(String name, int staffID, String specialization){
		super(name,staffID);
		this.specialization=specialization;
	}
	@Override
	void displayDetails(){
		System.out.println(name+" -> Staff ID="+staffID+", Specialization ="+ specialization);
	}
	

}

class Nurse extends Staff{

	private String shift;
	
	Nurse(String name, int staffID,String shift ){
		super(name, staffID);
		this.shift=shift;
	}
	@Override
	void displayDetails(){
		System.out.println(name+" -> Staff ID="+staffID+", Shift= "+ shift);
	}

}



class Q21{
	public static void main(String[] args){
		
		Staff s1 = new Doctor("Harshal", 120, "Cardiology");
		Staff s2 = new Nurse("Hina",201, "Night");
		

		s1.displayDetails();
		s2.displayDetails();
		

	}
}