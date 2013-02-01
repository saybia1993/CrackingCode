
// LCA problem
// design an algorithm to find the first common ancestor of two nodes in a binary tree.
// Avoid storing additional nodes in a data structure. (NOT necessarily a BST)



public class six {
	
	
	
	// method 1, trace p and q's paths up until they intersect (they must have the same parents)
	// this method require each node has a link to its parent (normally, node in binary tree don't have link to parent)
	public node findAncestor1(node a, node b){
		return null;
	}
	
	
	// method 2, only once DFS is enough : IMPORTANT!!!!
	// when searching a node t, if the tree with root t contains neither node, return 0, contains node 1, return 1
	// contains node 2, return 2, contains both nodes, return 3. Output the first node which return 3.
	public int findAncestor(node current, node a, node b){
		node temp;
		if (current == null) return 0;
		int re = 0;   // every current node hold an attribute "re"
		if (current == a) re+=1;   
		if (current == b) re+=2;
		int left = findAncestor(current.reLeft(), a, b);  // recursive find the left sub tree of current node
		int right = findAncestor(current.reRight(), a, b); // recursive find the right sub tree of current node
		re = re + left + right;
		if (re==3){
			temp = current;  // temp hold the ancestor
			return re;
		}
		else return re; // re is 0/1/2
	}
	
	// method 3, 
	
	
	
	
	
}
