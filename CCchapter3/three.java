
// implement a data structure SetOfStacks, the SetOfStacks should be composed of several stacks, and should create a new stack
// once the previous one exceeds the capacity, push() pop() should behave identically to a single stack

// FOLLOW UP: implement a function popAt(int index) which performs a pop operation on a specific sub-stack

import java.util.*;

public class three {
	
	// attributes
	ArrayList<Stack> stacks = new ArrayList<Stack>(); // create the ArrayList to store the index of each stack
	int maxSize;
	
	// constructor
	public three(int maxSize){   // maxSize is each array's max size
		this.maxSize = maxSize;
	}
	
	// method getLastStack
	public Stack getLastStack(){
		Stack s = stacks.get(stacks.size()-1); // get the last stack store in arraylist
		return s;
	}
	
	// method push
	public void push(Object j){
		Stack last = getLastStack();  // IMPORTANT!!! call the class itself's method do not need to create an object
		if ((last!= null)&(last.top!=last.maxSize-1)){  // could insert
			last.push(j);
		}
		else{  // must create a new array
			Stack newStack = new Stack(maxSize);
			newStack.push(j);
			stacks.add(newStack);
		}
	}
	
	// method pop
	public Object pop(){
		Stack last = getLastStack();
		Object pop = last.pop();
		if (last.top == -1) stacks.remove(stacks.size()-1);  // if the last stack is empty after pop, remove
		return pop;
	}
	
	
	// method popAt(int index), need extra method of Stack, otherwise cannot implemented
	public Object popAt(int index){ // index 0, 1, 2....
		return null;
	}
	
}
	

