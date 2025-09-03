//Grade with Plus/Minus
//Scenario: Take marks and print grade with plus/minus (e.g., 85 → A, 78 → A−).
import java.util.*;


class Q48 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        String grade = "";

        if (marks >= 90) {
            if (marks >= 98) {
                grade = "A+";
            } else if (marks >= 93) {
                grade = "A";
            } else {
                grade = "A-";
            }
        } else if (marks >= 80) {
            if (marks % 10 >= 8) {
                grade = "B+";
            } else if (marks % 10 <= 2) {
                grade = "B-";
            } else {
                grade = "B";
            }
        } else if (marks >= 70) {
            if (marks % 10 >= 8) {
                grade = "C+";
            } else if (marks % 10 <= 2) {
                grade = "C-";
            } else {
                grade = "C";
            }
        } else if (marks >= 60) {
            if (marks % 10 >= 8) {
                grade = "D+";
            } else if (marks % 10 <= 2) {
                grade = "D-";
            } else {
                grade = "D";
            }
        } else {
            grade = "F";
        }

        System.out.println("Grade : " + grade);

                
        
        }
}