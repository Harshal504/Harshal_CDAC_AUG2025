//Days in Month Considering Leap Year
//Scenario: Take a year and month number, print days in that month considering leap years.
import java.util.*;


class Q48 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        
        System.out.print("Enter month number: ");
        int m = sc.nextInt();
        
        int days = 0;
        
        if (m == 2) {
            if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
            System.out.println("Number of days: " + days);
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            days = 30; // April, June, September, November
            System.out.println("Number of days: " + days);
        } else {
            days = 31; // All other months
            System.out.println("Number of days: " + days);
        }
                
        
        }
}