
// Write a method to generate the nth Fibonacci number
// Fibonacci number: 0、1、1、2、3、5、8、13、21、34


public class one {

	
	// iteration method 
	public int findFibonacci (int n){ // input index, return number
		if (n<0) return -1; // error
		if (n == 0) return 0;
		if (n == 1) return 1;
		int a = 0; // first one of the number
		int b = 1; // second one of the number
		for (int i = 2; i<=n; i++){
			int c = a + b;
			a = b;  // first become second
			b = c;  // second become original two number's sum
		}
		return b;
	}
	
	
	// recursion method
	public int findFibonacci2(int n){
		if (n<0) return -1; // error
		else if (n==0) return 0;
		else if (n==1) return 1;
		else return findFibonacci2(n-2) + findFibonacci2(n-1);
	}
	
	// using matrix math
	
}
