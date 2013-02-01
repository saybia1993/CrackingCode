
// reverse a C-style string
// C-style string: abcd\0 : reverse: dcba\0


// toCharArray() method could generate an array which has a length exactly the same as that String
public class two {
	
	public String reverse(String s){
		char[] ch = s.toCharArray();
		int left = 0;  // index
		int right = ch.length-1;  // index
			while (left<right) {
				char temp = ch[right];
				ch[right] = ch[left];
				ch[left] = temp;
				left++;
				right--;
			}
		String str = new String(ch);   // call the constructor: String(char[] value)
		return str;
	}
}
