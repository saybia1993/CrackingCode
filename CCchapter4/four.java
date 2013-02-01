
// given a binary search tree, design an algorithm which creates a list of all the nodes at each depth
// if you have a tree with depth D, you'll have D linked lists

import java.util.*;

public class four {
	
	
	// method
	public ArrayList<LinkedList<node>> getList(binarySearchTree tree){
		int level = 0;
		ArrayList<LinkedList<node>> result = new ArrayList<LinkedList<node>>();  // store the result
 		LinkedList<node> list = new LinkedList<node>();     // store each level
 		list.add(tree.getRoot());  // add root in list
 		result.add(level, list);   // add the first list in level 0
 		while (true){
 			list = new LinkedList<node>();  // each loop create a linked list
 			for (int i=0; i<result.get(level).size(); i++){   // loop based on the upper level size of nodes
 				node n = result.get(level).get(i);    // get each node in upper level of the tree
 				if (n!= null){
 					if (n.reLeft()!= null) list.add(n.reLeft());
 					if (n.reRight()!= null) list.add(n.reRight());
 				}
 			}
 			if (list.size()>0) result.add(level+1, list);    // if add something, add the list into ArrayList
 			else break;
 			level++; // next level
 		}
	return result;  // return an array list
	}
}
