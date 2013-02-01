
// implement a function to check if a tree is balanced

// balanced tree:¡¡no two leaf nodes offer in distance from the root by more than one

import java.util.*;
	
public class one{
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	// method, pre-order traversal, tacking the leaves
	public void preorderTraversal(node n, int level) {
	    if ( n!= null) {   // node n exist  	
	    	if ((n.reLeft()==null)&(n.reRight()==null)) list.add(level);  // n is a leaf, add n's level into array list
	    	level++; 
	        preorderTraversal(n.reLeft(), level);   // pre-order traversal left sub tree
	        preorderTraversal(n.reRight(), level);  // pre-order traversal right sub tree
	    }
	}

	// method, return if it is balanced or not
	public boolean checkBalance (ArrayList<Integer> a){
		int temp = a.get(0);
		for (int i=1; i<a.size(); i++){
			if (Math.abs(temp-a.size())>1) return false;
		}
		return true;
	}
	
	
	
	
	
}
