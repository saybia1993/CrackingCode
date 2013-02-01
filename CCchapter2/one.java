
// write code to remove duplicates from an unsorted LinkedList
// if a temporary buffer is not allowed?

import java.util.*;


public class one {

	public static void main(String[] args){
		//null		
	}
	
	
	/*
	 * without java.util.*, the singly linked list only has ".next" method
	 */
	
	/**
	 *  method 1, with buffer, we can keep track of elements in HashMap and remove duplicates
	 *  let's assume all data in list is Integer
	 */
	public static void deleteDups1 (Node head){  // head is the first node of the linked list
		HashMap<Object, Object> map = new HashMap<Object, Object>();
		Node previousNode;  // pointer
		
		if (head!= null){    // put first element in hashmap
			map.put(head, head.getData()); 
			previousNode = head;
			head = head.getNext();
		}
		else return;
		
		while ( head!= null){     // testing the current element with hash map
			if (map.containsValue(head.getData())) {  // if true, duplicate
				previousNode.setNext(head.getNext());  //  IMPORTANT!!!
			}
			else {
				map.put(head, head.getData());
				previousNode = head;
			}
			head = head.getNext();
		}
	}
	
	
	/**
	 *  method 2, without buffer, we can iterate with two pointers:
	 *  i: does a normal iteration
	 *  j: iterates through all prior nodes to check for duplicates
	 *  (this method is just like removing duplicates in Strings, see chapter 1)
	 */

	public static void deleteDups2 (Node head){
		if (head == null) return;
		
		Node previous = head; //  the node before current, if need to delete current node, we must use this one
		Node current = previous.getNext(); //  the node need to compare with all previous nodes
		
		while (current!= null) {  // big loop
			Node runner = head; // runner for iteration in small loop
			while (runner != current){
				if (runner.getData() == current.getData()) { // need to delete current
					Node temp = current.getNext(); // get current's next node
					previous.setNext(temp); // set current's previous node's pointer to current's next node
					current = temp; // set current to current's next node
					break;
				}
			}
			if (runner == current){  // no duplicate
				previous = current;
				current = current.getNext();
			}
		} // while loop
	}

}





