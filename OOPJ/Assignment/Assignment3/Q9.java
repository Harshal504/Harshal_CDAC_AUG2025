//Animal Sound
//Scenario: You are building a zoo management system to play animal sounds.
//Problem Statement: Create a superclass Animal with method makeSound(). Subclass Dog and Cat override makeSound().
//Classes/Fields:
//● Animal → makeSound()
//● Dog → “Bark”
//● Cat → “Meow”


import java.util.*;

abstract class Animal{
	
	abstract void makeSound();

}

class Dog extends Animal{
	@Override
	void makeSound(){
		System.out.println("Dog => Bark");
	}
	
}

class Cat extends Animal{
	@Override
	void makeSound(){
		System.out.println("Cat => Meow");
	}

}


class Q9{
	public static void main(String[] args){
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.makeSound();
		a2.makeSound();
		


	}
}