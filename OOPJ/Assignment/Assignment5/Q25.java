//Problem 25: Command History Tracker
//Use Case: Store recent commands in a terminal with limited history.
//Requirements:
//● Maintain last 3 commands
//● Remove oldest when limit exceeded
//● Display recent commands
//Sample Input:
//Commands: "ls", "pwd", "cd ..", "mkdir"
//History limit: 3
//Expected Output:
//Recent Commands: pwd, cd .., mkdir

import java.util.*;
import java.util.Map.Entry;


class Q25{

	static <T> void command(Queue<T> cmds, T cmd){
		try{
			if(cmds.size()<3){
				cmds.offer(cmd);
			}else{
				cmds.poll();
				cmds.offer(cmd);
			}
		}catch(Exception e){
			
		}finally{
//			System.out.print("Recent Commands: ")
//			cmds.forEach(c -> System.out.print("\t"+c));
			System.out.println("Recent Commands: " + String.join(", ", (Queue<String>) cmds));
		}
	}

	public static void main(String[] args){
		Queue<String> cmds =new ArrayDeque<>();
		
		Q25.command(cmds, "ls");
		Q25.command(cmds, "pwd");
		Q25.command(cmds, "cd ..");
		Q25.command(cmds, "mkdir");
		Q25.command(cmds, "grep");


	}

}