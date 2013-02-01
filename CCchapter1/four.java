
// write a method to decide if two strings are anagrams or not

public class four {

	public static void main(String[] args){
		//null
	}
	
	/**
	 *  method 1, sort each string(based on ASCII) and use "==" to judge
	 */
	public static void anagram(String a, String b){
		
		// return sort(a) == sort(b);
	}
	
	/**
	 *  method 2, first compare No. of characters, then compare if the two Strings have identical counts for 
	 *  each unique character
	 */
	public static boolean anagram2(String a, String b){
		if (a.length() != b.length()) return false;
		int[] arrayA = new int[256];
		int[] arrayB = new int[256];
		char[] strA = a.toCharArray(); // string to char and store them in array
		char[] strB = b.toCharArray();
		for (int i=0; i<strA.length; i++){  // iterate the String a
			int temp = strA[i];
			arrayA[temp] +=1;
		}
		for (int i=0; i<strB.length; i++){
			int temp = strB[i];
			arrayB[temp] +=1;
		}
		for (int i=0; i<256;i++){ // iterate every elements between arrayA and arrayB
			if (arrayA[i] != arrayB[i]) return false;
		}
		return true;
	}
}
