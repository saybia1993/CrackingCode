
// you have two numbers represented by a linked list, where each node contains a single digit. digits are stored in reverse order
// write a function that adds two numbers and returns the sum as a linked list
// 3->1->5 + 5->9->2 = 8->0->8

public class four {

	/**
	 *  method 1, iteration
	 */

	public Node addList (Node headA, Node headB){
		
		if ((headA == null)&(headB == null)){
			return null;
		}
		
		int carry = 0;
		int sum = 0;
		int stay = 0;
		Node headC = null;
		
		while ((headA != null)|(headB != null)) {  // big loop, if only either of two linked list has data, loop continue
			
			if (headA != null){
				sum = sum + (Integer)headA.getData(); // if the Object data is Integer for sure, you could convert by adding (Integer) ahead
				headA = headA.getNext();
			}
			
			if (headB != null){
				sum = sum + (Integer)headB.getData();
				headB = headB.getNext();
			}
			
			if (carry == 1){  // has carry before
				sum = sum + carry;
				carry = 0;
			}  // sum is OK now
			
			if (sum >=10 ) {
				stay = (sum-10) % 10;
				carry = 1;
			}
			else {
				stay = sum;
			}
			
			headC.setData(stay);
			headC = headC.getNext();
		}
		return headC; // first node of the linked list
	}

	
	/**
	 *  method 2, recursion
	 */

	
}
