

public class SinglyLinkedList {
	
	Node start;
	
	public SinglyLinkedList(){ // constructor
		start = new Node(null, null);  // initial start to null
	}

	/**
	 * methods
	 */
	//
	public Node returnFirstNode(){
		return start.getNext();   // In my definition, start is a node(null, null), so the first node is start.getNext();
	}
	
	// add a node at last
	public void addToLast(Object data){
		Node current = start;
		Node last = new Node(data, null);
		while (current.getNext()!=null){
			current = current.getNext();
		}   // current is the last node right now
		current.setNext(last);  // IMPORTANT: connect current node to last node
	}
	
	// delete a node at last
	public void deleteAtLast(){
		Node current = start;
		Node previous = null;
		while (current.getNext()!=null){
			previous = current;
			current = current.getNext();
		}
		previous.setNext(null);
	}
	
	// add a node based on the previous node 
	
	
}
