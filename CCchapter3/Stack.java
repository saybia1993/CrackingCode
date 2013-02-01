
// implement a stack by array

public class Stack {
	
	   // attributes of class's object
	   public int maxSize;	  // index of maxSize
	   public int top;       // index of top
	   public Object[] stackArray;
	   
	   public Stack(int size) {   // constructor
		   maxSize = size;
		   stackArray = new Object[maxSize];
		   top = -1;
	   }
	   
	   public void push(Object j) {
		   if (top<maxSize-1) {
			   top +=1;
			   stackArray[top] = j;
		   }
		   else return;
	   }
	   
	   public Object pop(){
		   if (top>-1) {
			   top = top-1;
			   return stackArray[top+1];
		   }
		   else return null;
	   }
	   
	   public Object peek(){
		   if (top>-1) return stackArray[top];
		   else return null;
	   }
	   
	   public boolean isEmpty(){
		   if (top == -1) return true;
		   else return false;
	   }


	   // test
		public static void main(String[] args){ 
			Stack s = new Stack(5);
			int a = 1;
			String b = "true"; 
			char c = 'p';
			s.push(a);
			s.push(b);
			s.push(c);
			s.pop();
			Object k = s.peek();
			System.out.println(k);
		}
}



