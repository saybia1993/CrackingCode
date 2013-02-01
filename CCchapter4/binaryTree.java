
// implement a binary tree class
// this tree was implemented by linked list data structure (has a class "node", each node has reference to child and parent)


public class binaryTree {

	// attributes
	node root;
	node current;
	
	// constructor
	public binaryTree(int value){
			root = new node(value);
			current = root;
			System.out.println("Successful create a tree");
	}

	
	//-----------------------------------------------methods-----------------------------------------------
	// method, add left child of current node without moving current node
	public node addLeftChild(int value){
		return current.createLeftChild(value);
	}
	
	// method, add right child of current node without moving current node
	public node addRightChild(int value){
		return current.createRightChild(value);
	}
	
	// method, move to left child
	public void moveLeft(){
		current = current.reLeft();
	}
	
	// method, move to right child
	public void moveRight(){
		current = current.reRight();
	}
	
	// method, move to parent
	public void moveParent(){
		current = current.reParent();
	}
	
	// method, return current node's value
	public int getNodeValue(){
		return current.getValue();
	}

	// method, return root
	public node getRoot(){
		return root;
	}
	
	// method, return current node
	public node getCurrent(){
		return current;
	}
	
	
	// test
	public static void main(String[] args){
		binaryTree b = new binaryTree(0);
		b.getNodeValue();
		b.addLeftChild(1);
		b.moveLeft();
		b.getNodeValue();
		b.moveParent();
		b.addRightChild(2);
		b.moveRight();
		b.addRightChild(3);
		b.moveRight();
		b.addRightChild(4);
		b.moveRight();

	} // test
}
