//Shape Area Calculator
//Scenario: A drawing application needs to calculate area for different shapes: Circle, Rectangle, and Square.
//Problem Statement:
//● Interface Shape → method calculateArea()
//● Classes Circle, Rectangle, Square implement Shape → provide specific area calculation
//● In main(), create objects of each shape, input dimensions, display calculated area
//Sample Input: Circle → radius=5 Rectangle → length=10, breadth=5 Square → side=4
//Sample Output: Circle Area = 78.5 Rectangle Area = 50 Square Area = 16


import java.util.*;
interface Shape{
 	public void calculateArea();
}

class Circle implements Shape{
	private double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	public void calculateArea(){
		System.out.println("Circle Area = "+ (Math.PI*Math.pow(radius,2)));
	}
	
}


class Rectangle implements Shape{
	private int length;
	private int breadth;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public void calculateArea(){
		System.out.println("Rectangle Area = "+ (length*breadth));
	}

}


class Square implements Shape{
	private int side;
	
	Square(int side){
		this.side=side;
	}
	
	public void calculateArea(){
		System.out.println("Square Area = "+(Math.pow(side,2)));
	}
}

class Q27{
	public static void main(String[] args){
			Shape c = new Circle(20);
			Shape r = new Rectangle(20,40);
			Shape s = new Square(20);
			
			c.calculateArea();
			r.calculateArea();
			s.calculateArea();
	}
}
