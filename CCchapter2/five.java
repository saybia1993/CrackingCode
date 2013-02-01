
// given a circular linked list, implement an algorithm which returns node at the beginning of the loop
// a->b->c->d->e->c , return c


public class five {

	public static void main(String[] args){
		// null
	}
	
	/**
	 * let n1 moves 1 step, n2 moves 2 steps
	 * the tricky part here is : n1 and n2 will meet k nodes before the start of the loop on the loop
	 * k is also the number of nodes before the loop
	 * 
	 * So, we could move n1 back to head point and keep n2 at meeting point, and move them both at the same pace, they 
	 * will meet at loop start
	 */
	
	public static Node findPoint (Node head) {
		
		Node n1 = head;
		Node n2 = head;
		
		while (n2.getNext()!= null){
			n1 = n1.getNext();
			n2 = n2.getNext().getNext();
			if (n1 == n2) break;  // find the meeting point
		}
		
		if (n2.getNext()==null){
			return null;    // no loop
		}
		
		n1 = head;
		while (n1 != n2){
			n1 = n1.getNext();
			n2 = n2.getNext();
		}
		return n1;  // now n1 and n2 meet at the start of the loop
	}
	
	
}
