//Smart Devices
//Scenario: Smart devices can perform actions like calling, messaging, and browsing internet.
//Problem Statement:
//● Interface Callable → method makeCall(String number)
//● Interface Messaging → method sendMessage(String number, String message)
//● Interface Internet → method browse(String website)
//● Class SmartPhone implements all three interfaces → provide respective implementations
//Sample Input: Call → number="9876543210" Message → number="9876543210", message="Hello!" Browse → website="www.google.com"
//Sample Output: Calling 9876543210 Sending message to 9876543210: Hello!


import java.util.*;

interface Callable{
	public void makeCall(String number);
}

interface Messaging{
	public void sendMessage(String number, String message);
}

interface Internet{
	public void browse(String website);
}
class SmartPhone implements Callable, Messaging, Internet{

	public void makeCall(String number){
		System.out.println("Calling "+number);
		
	}
	
	public void sendMessage(String number, String message){
		System.out.println("Sending Message to  "+number+": "+message);
	}
	
	public void browse(String website){
		System.out.println("Browsing Website "+website);
		
	}

	
}

class Q26{
	public static void main(String[] args){
		
	Callable c= new SmartPhone();
	Messaging m = new SmartPhone();
	Internet i = new SmartPhone();
	
	c.makeCall("9876543210");
	m.sendMessage("9876543210","hello");
	i.browse("www.harshal.com");


	}
}