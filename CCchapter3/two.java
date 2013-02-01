
// implement a stack with min function which returns the minimum element in O(1) time


public class two{
	
	public int maxSize;	  // index of maxSize
	public int top;       // index of top
	public node[] stackArray; // rewrite
	
	public two(int size) {   // constructor
		maxSize = size;
		stackArray = new node[maxSize];
		top = -1;
	}
	
	/* 
	 * since each node need to carry a number, we cannot use Object any more, we need to define a class node
	 * since the element in node could be compared, we just define the value Integer
	 */
	static class node { 
		int value;  // node's attribute
		int trackForMin; // node's attribute
		public node(int value){
			this.value = value;
		}
	}
	
	
	/**
	 *  method 1, having each node in the stack keep track of the minimum beneath itself
	 */
	public void push(node j) {
		if (top<maxSize-1) {
			top +=1;
			stackArray[top] = j;
			if (top == 0) stackArray[top].trackForMin = stackArray[top].value;
			if (top>0){
				if (stackArray[top].value<stackArray[top-1].trackForMin){
					stackArray[top].trackForMin = stackArray[top].value;
				}
				stackArray[top].trackForMin = stackArray[top-1].trackForMin;
			}
		}
	}
	
	public node pop(){
		if (top>-1) {
			top = top-1;
			return stackArray[top+1];
		}
		else return null;
	}
		   
	public int returnMin(){
		   if (top>-1) return stackArray[top].trackForMin;
		   else{
			   int re = 0000;
			   return re;
		   }
	}

	/**
	 *  method 2, using an additional stack which keeps track of the mins
	 */
	
	
}
