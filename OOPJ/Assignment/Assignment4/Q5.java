//Problem 5: Online Shopping
//Scenario: An e-commerce platform processes orders by calculating the total price (quantity × unit price). The system needs to handle invalid quantities and accessing non-existent products.
//Task: Create an order processing method that handles multiple exception types.
//Sample Input:
//0
//3
//299.99 499.99 199.99
//5
//Expected Output:
//Arithmetic Exception caught
//or
//Array Index Exception


	
	

class Q5{
	
	static void oProcess(int noOfproducts, double[] prices, int quantity, int productno){
		try{
			if(quantity<0){
				throw new ArithmeticException();
			}
			System.out.println("Total Price: "+ (prices[productno-1]*quantity));
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception caught");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Exception");
		}
	}

	
	
	public static void main(String[] args) {
		oProcess(3, new double[]{299.99, 499.99, 199.99}, 0, 5);
		oProcess(3, new double[]{299.99, 499.99, 199.99}, 4, 3);
		oProcess(3, new double[]{299.99, 499.99, 199.99}, -1, 3);
		oProcess(3, new double[]{299.99, 499.99, 199.99}, 2, 5);
		oProcess(3, new double[]{299.99, 499.99, 199.99}, -1, 5);
	}
}