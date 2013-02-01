
// implement an algorithm to find the nth from last element of a singly LinkedList

public class two {

	public static void main(String[] args){
		//null
	}
	
	public static Node nth (Node head, int n){
		
		if ((head == null)|(n<1)) return null;
		Node node = head;
		
		for (int i=0; i<n-1; i++){
			if (node == null){
				return null;
			}
			node = node.getNext();
		}
		
		while (node.getNext()!=null){ // keep a list with length n and move the tail to the end, the head is the result
			head = head.getNext();
			node = node.getNext();
		}
		return head;
	}
}
