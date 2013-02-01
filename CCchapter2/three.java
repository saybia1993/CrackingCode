
// delete a node in the middle of a single linked list, given only access to that node
// a->b->c->d->e, a->b->d->e

public class three {

	public static void main(String[] args){
		
	}
	
	/**
	 * normally, if we want to delete a node in linked list, we need to know that node's previous nodes
	 * then, we set previous.next = node.next
	 */
	
	/**
	 * however, we also could copy the data from node.next to node and then delete the next node
	 */
	
	public static boolean deleteNode (Node n) {  // given that node n, only can access n
		if ((n==null)|(n.getNext() == null)) return false;
		
		n.setData(n.getNext().getData());  // copy data from n.next to n
		n.setNext(n.getNext().getNext());  // link n to n.next.next , delete n.next's link 
		return true;
	}
}
