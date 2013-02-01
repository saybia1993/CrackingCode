
// write an algorithm to find the 'next' node (e.g. in-order successor) of a given node in a binary search tree

// PAY ATTENTION, the pre, in, post, order's outputs are different
// in-order's output is ordered from smallest to largest, thus in-order traversal's successor is the same as BST's successor

public class five {

	// for in-order successor, x.left, x, x.right
	// condition 1, x has right child (x's left child doesn't matter)
	// condition 2, x doesn't have right child, x is the left child of P
	// condition 3, x doesn't have right child, x is the right child of P
	
	
	// method
	public node inOrderFindNext(node n){
		if (n!= null){
			if (n.reRight() != null){  // x has right child
				while(n.left!= null) {
					n = n.left;
				}
				return n;
			}
			else {   // x doesn't have right child
				while (n.parent != null){
					if (n.parent.left == n) return n.parent;
					n = n.parent;
				}
			}
		}
		return null;
	}
}
