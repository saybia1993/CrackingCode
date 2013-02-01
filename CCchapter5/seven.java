
// An array A[1...n] (ArrayList<Integer>) contains all the integers from 0 to n except for one number which is missing
// the number of A are represented in binary, and we cannot access an entire integer in A with a single 
// we can just use the "fetch the jth bit of A[i]" with takes constant time. Find the missing number in O(n) time

import java.util.*;

public class seven{
	 
	public static int missingNumber(ArrayList<String> A){
		int k = A.get(0).length();	//count of bits
		
		return missingNumber(A, k-1);
	}
	
	public static int missingNumber(ArrayList<String> A, int k){  // k is the count of bits
		if (k < 0)
			return 0;
		
		ArrayList<String> zero = new ArrayList<String>();
		ArrayList<String> one = new ArrayList<String>();
		
		for (String integer : A) {
			if (integer.charAt(k) == '0')
				zero.add(integer);
			else if (integer.charAt(k) == '1')
				one.add(integer);
			else {
				System.out.println("Invalid input");
				System.exit(1);
			}	
		}
		
		if (zero.size() <= one.size())			//missing 0
			return (missingNumber(zero, k-1)) << 1 | 0;  //????????????
		else 						//missing 1
			return (missingNumber(one, k-1)) << 1 | 1;   //??????????
	}
 
	
	
	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>();
		A.add("000");
		A.add("010");
		A.add("001");
		A.add("100");
		A.add("101");
		A.add("111");
		A.add("110");
		
		int m = missingNumber(A);
		System.out.println(m);
	}
}
