


import java.util.*;
import java.lang.*;


class RatInMaze{
	static int N;
	
	static void solveMaze(int[][] maze, int y, int x, String path, List<String> paths){
		
//		 Base condition: checking value "0" for blocked cells and index  -1 & N to check if index is out of matrix
		if(x == -1 || y == -1 || x == N || y == N || maze[y][x] == 0 ){
			
			return;
		}else 
//		Base Condition: Checking destination cell to end the currect path search.
		if(x  == N-1 && y  == N-1){
			paths.add(path);
		}
		
//		to block visited Cell for current path
		maze [y][x] = 0;
		
		
//		to go down
		solveMaze(maze, y+1, x, path+"D" ,paths);
		
//		to go Up
		solveMaze(maze, y-1, x, path+"U" ,paths);
		
//      to go Right
		solveMaze(maze, y, x+1, path+"R" ,paths);

//      to go Left
		solveMaze(maze, y, x-1, path+"L" ,paths);
		
//		To open visited cell for new paths
		maze [y][x] = 1;
		
		
	}

	static List<String> findPath(int[][] maze){
//		List to store multiple paths
		List<String> paths = new ArrayList<>();
		
//		Start Base condition to check if Start(source) is valid
		if(maze[0][0] == 0){
			return paths;
		}
		
//		Called solveMaze function where we pass Matrix maze, start index (source), empty string for path and List to store paths
		solveMaze(maze, 0, 0, "", paths);
		
		return paths;
	}
	public static void main(String[] args){
//		 Maze Input Matrix
		int [][] maze = {
			{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
		};
//		[DDRDRR, DRDDRR]

//      Initialized the length of Matrix
		N = maze.length;
		
		List<String> results = findPath(maze) ;
		
		
		
		System.out.println(results);
		
		
	}
}