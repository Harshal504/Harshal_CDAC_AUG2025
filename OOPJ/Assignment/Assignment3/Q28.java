//Online Shopping Cart System
//Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and apply discounts.
//Problem Statement:
//● Class Product → instance variables: productId, name, price (Encapsulation: use private variables with getters/setters)
//● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic behavior for cart items)
//● Class Cart extends CartItem → store list of products, implement calculateTotalPrice()
//● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can have discounts applied) In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost
//Sample Input: Product1 → name="Laptop", price=50000 Product2 → name="Mouse", price=500 Product3 → name="Keyboard", price=1200
//Sample Output: Applying 10% discount to Laptop Total Cart Price = 51800


import java.util.*;
class Product implements Discountable{
	private int productId;
	private String name;
	private double price;
	
	Product(int productId, String name, double price){
		this.productId=productId;
		this.name=name;
		this.price=price;
		
	}
	public int getProductId() {
		return this.productId;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void applyDiscount(double percentage){
		
	}	
}


abstract class CartItem{
	abstract void calculateTotalPrice();
}

class Cart extends CartItem{
	private Product[] products;
	private int productCount=0;
 
 	Cart(int capacity){
 	this.products = new Product[capacity];
 	
    }
	void addCart(Product product){
		if(productCount < products.length){
			this.products[productCount]= product;
		}
		productCount++;
	}    
 
 	void calculateTotalPrice(){
 		double total = 0;
 		for(int i=0;i<products.length; i++){
 			total += products[i].getPrice();
 		}
 		System.out.println("Total Price"+ total);
 	}
 	
	
}

interface Discountable{
	public void applyDiscount(double percentage);

}


class Q28{
	public static void main(String[] args){
		
		Product p1 = new Product(101,"Macbook", 95000);
		Product p2 = new Product(104, "notebook", 15000);
		Product p3 = new Product(110, "Speaker", 7000);
		
		Cart c = new Cart(3);
		
		c.addCart(p1);
		c.addCart(p2);
		c.addCart(p3);
		
		c.calculateTotalPrice();

		

	}
}
