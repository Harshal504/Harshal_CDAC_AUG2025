//Problem 7: Student List
//Scenario: A school management system tries to load a student list from a file at the beginning of each semester. Sometimes the file might not exist or be corrupted.
//Task: Simulate file reading operation and handle FileNotFoundException.
//Sample Input:
//student_list.txt
//Expected Output:
//File not found


import java.io.*;
import java.util.*;

class Q7{
	
	static void findFile(String path){
		try{
			File file = new File(path);
			Scanner sc = new Scanner(file);
			System.out.println("file found "+path);
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}
	
	}

	public static void main(String[] args) {
//		String path ="abc.txt";
		findFile("abc.txt");
		
		findFile("Q1.java");
		
		

	}
}


//class Q7{
//	
//	static void findFile(String path) throws FileNotFoundException{
//			File file = new File(path);
//			Scanner sc = new Scanner(file);
//			System.out.println("file found "+path);

//	
//	}
//
//	public static void main(String[] args) throws FileNotFoundException {
//		try{	
//			findFile("Q1.java");
//	
//			findFile("abc.txt");
//		
//			findFile("Q1.java");
//		}catch(FileNotFoundException e){
//			System.out.println("File not found");
//		}finally{
//			System.out.println("invalid Path");
//		}
//		
//
//	}
//}