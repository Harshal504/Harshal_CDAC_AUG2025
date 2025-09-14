//Problem 21: Data Processing Cleanup
//Scenario: A data processing system handles user form submissions and must always close database connections and clean up resources, whether the processing succeeds or fails.
//Task: Use finally block to ensure proper resource cleanup.
//Sample Input:
//(No input required)
//Expected Output:
//Exception occurred: Invalid input
//Data processing completed


import java.io.*;
import java.util.*;

class Checkinput extends Exception{
	Checkinput(){
		super("Invalid input");
	}
}

class Q21{	
	
		
	public static void main(String[] args) throws Checkinput{
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		try{
			if(s==null || s==""){
				throw new Checkinput();
			}
		}catch(Checkinput e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Data processing completed");
		}
		
		

	}
}

