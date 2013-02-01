
// write a method that returns all subsets of a set

import java.util.ArrayList;

public class three {
	
	/**
	 *  method 1, recursion
	 */
	
	
	
	
	/**
	 *  method 2, represent by binary, 1 means yes, 0 means no
	 *  it is important to know that, a set of n numbers has 2^n subset
	 *  it is also equals to from 0 to 111111(n's 1) + 1
	 */
	public ArrayList<ArrayList<Integer>> getSubsets (ArrayList<Integer> list){
		
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1 << list.size(); // like: 10000
		for (int i=0; i<max; i++){  // like: 0-1111 (1000-1)
			ArrayList <Integer> eachSubset = new ArrayList<Integer>(); // 
			int k = i;  // the current number
			int index = 0; // index for each k
			while (k>0){
				if ((k&1) == 1) { // 0's digit of k is 1 (binary)
					eachSubset.add(list.get(index)); // add this 
				}
			k = k>>1; // pull next digit to position zero
			index++;  // index of list corresponding to k plus one
			}
		allSubsets.add(eachSubset); // add all subsets into the whole array list
		}
		return allSubsets;
	}
	
	
	
	
}
