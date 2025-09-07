//Shape Drawing
//Scenario: A graphics program needs to draw different shapes.
//Problem Statement: Create an abstract class Shape with abstract method draw(). Subclass Circle and Rectangle implement draw().
//Classes/Fields:
//● Shape → draw() (abstract)
//● Circle → radius
//● Rectangle → length, breadth
//Sample Input: Circle → radius=7 Rectangle → length=5, breadth=10
//Sample Output: Drawing Circle of radius 7 Drawing Rectangle of length 5 and breadth 10


import java.util.*;

abstract class Shape{
	
	abstract void draw();
	
}

class Circle extends Shape{
	private double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	void draw(){
		System.out.println("Drawing Circle of radius "+radius);
	}
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	
	void draw(){
		System.out.println("Drawing Rectangle of length "+length+" and breadth "+breadth);
	}
	

}	
	
	
class Q13{
	public static void main(String[] args){
		
		Shape s1 = new Circle(25);
		Shape s2 = new Rectangle(10,23);
		
		s1.draw();
		s2.draw();
		
		
	}
}