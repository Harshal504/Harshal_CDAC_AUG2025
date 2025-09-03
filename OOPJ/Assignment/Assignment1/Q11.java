//Grade based Percentage

import java.util.*;


class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter percentage marks ");
        int m = sc.nextInt();
        
        // Use an if-else if ladder to check for ranges
        if (m >= 90) {
            System.out.println("Grade : A+");
        } else if (m >= 75) {
            System.out.println("Grade : A");
        } else if (m >= 65) {
            System.out.println("Grade : B+");
        } else if (m >= 50) {
            System.out.println("Grade : B");
        } else if (m >= 35) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Grade : Fail");
        }
        sc.close();
    }
}