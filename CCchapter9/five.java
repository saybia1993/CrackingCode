
// given a sorted array of strings which is interspersed with empty strings
// write a method to find the location of a given string

public class five {

	/**
	 * using binary search
	 * @param str : input array
	 * @param s : the string which need to find
	 * @param indexLeft : left index of the array
	 * @param indexRight : right index of the array
	 * @return : the index of s in array str
	 */
	public int searchForString(String[] str, String s, int indexLeft, int indexRight){
		
		while (indexLeft<=indexRight && str[indexRight]==""){
			indexRight--;
			if (indexRight<indexLeft) return -1;// no word exist in this array
		}
		
		int mid = (indexLeft+indexRight)/2; // find the mid point
		
		while(str[mid] == ""){
			mid = mid +1;      // will always find a string which is not empty
		}
		
		int k = str[mid].charAt(0); // first letter of current mid
		int r = s.charAt(0);  // first letter of s
		
		if (r == k) {  // here we assume the words won't have the same initial
			return mid;
		}
		else if (r>k){
			return searchForString(str, s, mid+1, indexRight); 
		}
		else{
			return searchForString(str, s, indexLeft, mid-1);
		}
	}
}
