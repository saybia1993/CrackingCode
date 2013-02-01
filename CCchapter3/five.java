
// implement a myQueue class which implements a queue using two stacks

public class five { // myQueue
	
	int length;
	Stack s1 = new Stack(length);
	Stack s2 = new Stack(length);
	
	public five(int length){
		this.length = length;
	}
	
	// method, return the 
	public int size(){
		return length;
	}
	
	// method, add the element at the head
	public void add(Object j){
		s1.push(j);
	}
	
	// method, peek the element at the tail
	public Object peek(){
		while (s1.top != -1) {
			s2.push(s1.pop());
		}
		return s2.peek();
	}
	
	// method, remove the element at the tail
	public Object remove() {
		while (s1.top != -1) {
			s2.push(s1.pop());
		}
		Object temp = s2.pop();
		return temp;
	}
	
}
