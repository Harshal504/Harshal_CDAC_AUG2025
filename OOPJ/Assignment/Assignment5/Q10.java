//Problem 10: Electronic Voting System
//Use Case: Track unique voters in an election system to prevent duplicate voting.
//Requirements:
//● Record voter IDs
//● Ensure one vote per voter
//● Count total unique voters
//Sample Input:
//Voter IDs: 201, 202, 203, 202
//Expected Output:
//Total voters: 3

import java.util.*;


class Q10{
	


	public static void main(String[] args){

		Set<Integer> votes = new TreeSet<Integer>();
		
		votes.add(201);
		votes.add(201);
		votes.add(203);
		votes.add(202);
		
		System.out.println("Total Voters:"+votes.size());
	
	
	
	}

}