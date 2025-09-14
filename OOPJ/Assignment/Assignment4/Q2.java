//Problem 2: Exam Scores
//Scenario: A teacher is using a digital gradebook system to access student scores. Sometimes they might accidentally try to access the score of a student number that doesn't exist in the class roster.
//Task: Create a program that stores exam scores in an array and safely accesses student scores by index.
//Sample Input:
//3
//78 90 85
//5
//Expected Output:
//Invalid index accessed


class Students{
	private int noOfStudents;
	private int[] marks;
	private int count;
	Students(int noOfStudents){
		this.noOfStudents=noOfStudents;
		this.marks = new int[noOfStudents];
		this.count = 0;
	}
	
	void addMarks(int mark){
		this.marks[count]=mark;
		count++;
	}
	
	void getMarks(int studentNo){
		try{
			if(studentNo-1>marks.length){
				throw new ArrayIndexOutOfBoundsException("Invalid index accessed");
			}
		System.out.println(marks[studentNo-1]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
//		return marks[studentNo];
	}
}
	
	

class Q2{
	public static void main(String[] args){
		Students div1 = new Students(3);
		div1.addMarks(75);
		div1.addMarks(25);
		div1.addMarks(65);
		
		div1.getMarks(2);
		div1.getMarks(3);
		div1.getMarks(5);
		
	
	}
}