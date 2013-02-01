
// implement a binary search tree by using node class
// different from binary tree, BST only have one "add" method
// we assume that each input value is different

public class binarySearchTree {

	// attributes
	node root;
	node current;
	
	// constructor
	public binarySearchTree(int value){
		root = new node(value);
		current = root;          // set current to root
		System.out.println("Successful create a BST with root node");
	}
	
	// -------------------------------------------methods-----------------------------------------------
	// method
	public void addChild(int value){
		node n = new node(value); // create a new node
		node temp = null;    	// temp hold current node's parent
		while (current != null){
			if (n.getValue()>current.getValue()){ // compare with right
				temp = current;
				current = current.reRight();
			}
			else{           // compare with left
				temp = current;
				current = current.reLeft();
			}
		}// here, current = null is the place for insertion, REMEMBER, while n's parent and child are set, n is done
		n.parent = temp; // set n's parent
		if (temp.getValue()>n.getValue()) temp.left = n;  // set temp's child
		else temp.right = n;
		current = root; // reset current to root
	}
	
	// method
	public node getCurrent(){
		return current;
	}
	
	// method
	public node getRoot(){
		return root;
	}
	
	// method
	public void moveLeft(){
		current = current.left;
	}
	
	// method
	public void moveRight(){
		current = current.right;
	}
	
	// method
	public void moveParent(){
		current = current.parent;
	}
	
	// method
	public int getValue(){
		return current.value;
	}
	
	
	// test
	public static void main(String[] args){
		binarySearchTree t = new binarySearchTree(5);
		t.addChild(6);
		t.addChild(4);
		t.addChild(3);
		t.addChild(7);
		t.moveRight();
		System.out.println(t.getValue());
	}// test

}
