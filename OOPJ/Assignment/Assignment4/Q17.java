//course information that includes year details. When information becomes outdated, the year needs to be removed.
//Task: Use StringBuffer to remove outdated information.
//Sample Input:
//Original text: CDAC Kharghar 2024
//Exact substring to delete: 2024
//Expected Output:
//CDAC Kharghar


import java.io.*;
import java.util.*;



class Q17{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("CDAC Khargar 2024");
		int start = sb.indexOf("2024");
		int end = start+"2024".length();
		sb.delete(start,end);
		
		System.out.println(sb);

	}
}

