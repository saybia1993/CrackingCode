
// Write a function to determine the number of bits required to convert integer A to integer B
// input: 31, 14
// output: 2

public class five {

	/**
	 *  just compare the difference between each integer's binary code
	 * 	using XOR, different:true, same:false
	 */
	
	public int bitCheck(int a, int b){
		
		int count = 0;
		for (int c = a^b; c!=0; c = c >>1){
			count+= c&1;  // only the first one is 1, c&1 = 1
		}
		return count;
	}
}
