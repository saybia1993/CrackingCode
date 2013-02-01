
// remove duplicate characters in a string without using any additional buffer

public class three {

	public static void main (String[] args){
		// null
	}
	
	/**
	 *  method 1, without using additional buffer, all operation in original string
	 */
	public static void removeDuplicate (char[] str){
		
		if (str == null) return;  // condition 1
		
		int strLength = str.length;  // condition 2
		if (strLength < 2) return;
		
		// condition 3
		//  ************
		//     ^ this one compare to the element before 
		int tail = 1; // the result sequence's tail index
		for (int i=1; i<str.length; i++){ // big cycle
			int j;
			for (j=0; j<tail; j++){  // small cycle
				if (str[i]==str[j]) break;
			}
			if (j == tail) { // this time, successfully update the j sequence
			str[tail] = str[i];  
			tail+=1; // tail + 1
			}
		}
		str[tail]=0;
	}
	
	/**
	 *  method 2, with using additional buffer
	 */
	public static void removeDuplicate2 (char[] str){
		
		if (str == null) return;
		
		int strLength = str.length;
		if (strLength <2) return;
		
		boolean[] asc = new boolean[256];
		int tail = 0;
		for (int i=0; i<strLength; i++){
			int val = str[i]; // ascII: val	
			if (asc[val]==false){ // if false, update, if true, next i
				str[tail]=str[i];
				tail +=1;
				asc[val]=true;
			}
		}
		str[tail]=0;
	}
	

}
