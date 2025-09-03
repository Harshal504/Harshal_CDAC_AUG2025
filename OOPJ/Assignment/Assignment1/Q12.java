//Oldest and Youngest Among Three Friends
//Scenario: You and two friends want to know who is oldest and youngest. Take ages as input and print the oldest and youngest.
1,2;1,3;2,1;2,3;3,1;3,2
import java.util.*;


class Q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of Friend 1: ");
        int f1 = sc.nextInt();
        System.out.println("Enter age of Friend 2: ");
        int f2 = sc.nextInt();
        System.out.println("Enter age of Friend 3: ");
        int f3 = sc.nextInt();
        
        String oldest = "";
        String youngest = "";

        // Determine the oldest friend
        if (f1 >= f2 && f1 >= f3) {
            oldest = "Friend 1";
        } else if (f2 >= f1 && f2 >= f3) {
            oldest = "Friend 2";
        } else {
            oldest = "Friend 3";
        }

        // Determine the youngest friend
        if (f1 <= f2 && f1 <= f3) {
            youngest = "Friend 1";
        } else if (f2 <= f1 && f2 <= f3) {
            youngest = "Friend 2";
        } else {
            youngest = "Friend 3";
        }

        System.out.println("Oldest: " + oldest);
        System.out.println("Youngest: " + youngest);

        sc.close();
        

    }
}