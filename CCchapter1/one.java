
// determine if a String has all unique characters. what if you cannot use additional data structure?

public class one {
	public static void main (String[] args){
		//null
		}
	
	/**
	 *  method 1, the No. of characters won't exceed 256, just create a 256 array, set all false, put corresponding
	 *  array to true if meet the character which has that ASCII number.
	 */
	public static boolean unique(String str){
		boolean[] asc2 = new boolean[255]; // create an 256 array
		for (int i=0; i<str.length(); i++){ 
			int val = str.charAt(i);  // IMPORTANT! char to int! (since all characters are in ASCII, 0 to 255)
			if (asc2[val] == true) return false; // asc2[val] = true means two characters are same
			asc2[val] = true;
		}
		return true;
	}
	
	/**
	 *  method 2, compare between each characters, two for loop
	 */
	public static boolean unique3 (String str){
		for (int i=0; i<str.length(); i++){
			for (int j=i+1; j<str.length(); j++){ // compare each characters after this i
				if (str.charAt(i)== str.charAt(j)) return false;
			}
		}
		return true;
	}
	
	/**
	 *  method 3, string is only lower cases 'a' through 'z', it's tricky!!!!
	 */
	public static boolean unique2 (String str){
		
		return true;
	}

	/**
	 *  method 4, sorting first, check neighboring
	 */
	public static boolean unique4 (String str){
		
		return true;
	}

}

