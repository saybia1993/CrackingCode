
// it is important to know that:
// pre, in, post-order traversal are all DFS in tree
// BFS excluded

public class traversal {

	
	// method 1, pre-order traversal: mid, left, right
	public void preOrder(node root){
		if (root != null){
			System.out.println(root.getValue());
			preOrder(root.reLeft());
			preOrder(root.reRight());		
		}
	}
	
	// method 2, in-order traversal: left, mid, right
	public void inOrder(node root){
		if(root!= null){
			inOrder(root.reLeft());
			System.out.println(root.getValue());
			inOrder(root.reRight());
		}
	}
	
	// method 3, post-order traversal: left, right, mid
	public void postOrder(node root){
		if(root!=null){
			postOrder(root.reLeft());
			postOrder(root.reRight());
			System.out.println(root.getValue());
		}
	}
	
}
