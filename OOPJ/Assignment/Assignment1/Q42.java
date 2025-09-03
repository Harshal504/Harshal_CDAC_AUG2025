//Check Armstrong Number (3-Digit)
//Scenario: Take a 3-digit number and check if it is an Armstrong number (sum of cubes of digits = number
import java.util.*;


class Q42 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
//        System.out.println("Enter number: ");
//        int arm = sc.nextInt();
        
        
        for(int arm = 100; arm<= 500; arm++){
        int a = 0;
        int ar =arm;
        while(ar > 0){
            int d = ar%10;
            a += (d*d*d);
            ar = ar/10;
        }
        if(arm == a){
        System.out.println(arm +" is an Armstrong number ");
        }
        }
    }
        
  
}