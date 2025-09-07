
//Shape Area Calculation
//Scenario: A program needs to calculate the area of different shapes using the same method name but different parameters.
//Problem Statement: Create a class ShapeArea with overloaded methods calculateArea().
//Methods:
//● calculateArea(int side) → calculates area of square
//● calculateArea(int length, int breadth) → calculates area of rectangle
//● calculateArea(double radius) → calculates area of circle
//Sample Input: Square → side=5 Rectangle → length=4, breadth=6 Circle → radius=3
//Sample Output: Square Area = 25 Rectangle Area = 24 Circle Area = 28.26


import java.util.*;
import java.lang.Math;

class ShapeArea{

	void calculateArea(int side){
		System.out.println("Square Area = "+(Math.pow(side,2)));
	}

	void calculateArea(int length, int breadth){
		System.out.println("Rectangle Area = "+ (length*breadth));
	}
	
	void calculateArea(double radius){
		System.out.println("Circle Area = "+ (Math.PI*Math.pow(radius,2)));
	}
}	
	
class Q15{
	public static void main(String[] args){
		
		ShapeArea s1 = new ShapeArea();
		
		s1.calculateArea(20);
		s1.calculateArea(10,30);
		s1.calculateArea(10D);
		
		
	}
}