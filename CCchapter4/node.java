
// the node of tree

public class node {

	//attributes
	node left;     // left child
	node right;    // right child
	node parent;   // parent
	int value;     // the value of node

	// constructor
	public node(int value){
		this.value = value;
		left = null;
		right = null;
		parent = null;
	}
	
	// --------------------------------------------------methods--------------------------------------------
	// method
	public node createLeftChild(int value){
		node n = null;
		if (left == null){
			n = new node(value);
			left = n;
			n.parent = this;
		}
		return n;
	}
	
	// method 
	public node createRightChild(int value){
		node n = null;
		if (right == null){
			n = new node(value);
			right = n;
			n.parent = this;
		}
		return n;
	}
	
	// method
	public void setValue(int value){
		this.value = value;
	}
	
	// method
	public int getValue(){
		return value;
	}
	
	// method
	public node reLeft(){
		return left;
	}
	
	// method
	public node reRight(){
		return right;
	}
	
	// method
	public node reParent(){
		return parent;
	}

}
