
// replace all the spaces in a string with '%20'

public class five {
	
	public static void main(String[] args){
		// null
	}
	
	/**
	 *  create a new array to store the new string
	 */
	public static String replaceBlank (String str){
		char[] stringToChar = str.toCharArray(); // convert from string to char[] 
		int space = 0;
		for (int i=0; i<stringToChar.length; i++){
			if (stringToChar[i] == ' ') space +=1; // count space
		}

		int lengthOfNew = stringToChar.length + space*2; // length for store the new array
		
		char[] newArray = new char[lengthOfNew]; // create a new array
		int j=0;         // j is the index of new array
		String s = "";   // need to return s
		for(int i=0; i<stringToChar.length; i++){
			if (stringToChar[i] == ' ') {
				newArray[j] = '%';
				newArray[j+1] = '2';
				newArray[j+2] = '0';
				j += 3;
			}
			else {
				newArray[j] = stringToChar[i];
				j += 1;
			}
		}
		for(int i=0; i<lengthOfNew; i++){
			String temp = String.valueOf(newArray[i]);
			s = s + temp;  //return string
		}
		return s; // return
	}
	
	
}
