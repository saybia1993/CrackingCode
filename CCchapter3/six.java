

//Write a program to sort a stack in ascending order. 

public class six {
	
	
	// method to sort
	public Stack sort(Stack s){  // input Stack s
	
		Stack output = new Stack(s.maxSize);
		while (!s.isEmpty()){ // s is not empty, loop execute
			int i = (Integer)s.pop();
			while (((Integer)output.peek()>i)&(!output.isEmpty())){ // IMPORTANT! (top element in output bigger than i) & (output is not empty)
				s.push(output.pop());  // push element back to s from output until the condition is satisfied
			}
			output.push(i);  // push that element into output stack
		}
		return output;
	}
}
