//Shape Area Calculation
//Scenario: You are designing a program to calculate areas of different shapes.
//Problem Statement: Create a superclass Shape with a method area(). Derive two subclasses Rectangle and Circle. Implement area() in each subclass.
//Classes/Fields:
//● Shape → area() (method stub)
//● Rectangle → length, breadth
//● Circle → radius
//Methods:
//● Rectangle.area() → length × breadth
//● Circle.area() → π × radius²

import java.util.*;

abstract class Shape{
	
	
	abstract double area();
	
}

class Rectangle extends Shape{
	private double length;
	private double breadth;

	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double area(){
		return length*breadth;
		
	}
}

class Circle extends Shape{
	private double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	double area(){
		
		return (3.14*radius*radius);
		
	}
}



class Q6{
	public static void main(String[] args){
		
		Rectangle r = new Rectangle(5,8);
		
		Circle c = new Circle(8);
		
		System.out.println("Area of Rectangle:"+ r.area());
		System.out.println("Area of Circle: "+ c.area());

		

	}
}