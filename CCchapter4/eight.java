	
// you are given a binary tree in which each node contains a value.
// design an algorithm to print all paths which sum up to a value. 
// note that it can be any path in the tree and it doesn't have to start at the root
	
import java.util.*;

public class eight {
	
	// method, current: normally the root, sum: input data, list: every node hold an array list, level: the node's level
	public void finSum(node current, int sum, ArrayList<Integer> list, int level){
		
		if (current == null) return;
		int temp = sum;   // every node hold a "sum": temp 
		list.add(current.getValue());  //add the value of node in this node's ArrayList
		for (int i = level; i>=0; i--){
			temp = temp - list.get(i);
			if (temp == 0) print(list, i, level);
		}
		ArrayList<Integer> c1 = (ArrayList<Integer>)list.clone();// copy the previous nodes' value into new ArrayList
		ArrayList<Integer> c2 = (ArrayList<Integer>)list.clone();// 
		finSum(current.reLeft(), sum, c1, level+1);  // recursively call the finSum method with current's child and new ArrayList
		finSum(current.reRight(), sum, c2, level+2);
	}  // every node hold an ArrayList which store all the previous nodes' value in the path
		
	// method, output the result
	public void print(ArrayList<Integer> list, int currentLevel, int level){
		for (int i= currentLevel; i<=level; i++){
			System.out.println(list.get(i)+" ");
		}
		System.out.println();   //blank line
	}
	
	
	
	
}	
