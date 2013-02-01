
// assume you have a method "isSubString" which could check if one word is a substring of another.
// Given two string s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring

public class eight {

	public static void main(String[] args){
		String a = "apple";
		String b = "leapp";
			boolean k = ifRotated(a, b);
			System.out.println(k);
	}
	
	public static boolean ifRotated(String s1, String s2){
		
		if ((s1.length() != s2.length())|(s1.length()==0)|(s2.length()==0)) return false;
		String s1s1 = s1+s1;
		return isSubString(s1s1, s2);   // this is important! concatenate s1 and s1
		
	}
	
	/**
	 *  method isSubString, return true/false
	 */
	public static boolean isSubString (String s1, String s2){ // check if s2 is the substring of s1
		char[] charOriginal = s1.toCharArray();
		char[] charToCompare = s2.toCharArray();
			for (int i =0; i<charOriginal.length; i++){ 
					int temp1 = 0;
					int temp2 = i;
					while (charToCompare[temp1] == charOriginal[temp2]){ // detecting the rest of the elements
						temp1 +=1;
						temp2 +=1;
						if ((temp1-0)==(charToCompare.length-1)) return true;
					}
				}	
		return false;
	}
	
}
