
// Given a sorted array (increasing) of n integers that has been rotated an unknown number of times
// give an O(logn) algorithm that finds an element in the array


public class three {

	/**
	 *  the rotation of an sorted array has characteristic that, 
	 *  no matter how many times' rotation and how to divide the left or right part, 
	 *  the result could be divided into two increase array: 
	 *  1, 2, 3, 4, 5, 6, 7
	 *  4, 5, 6, 7, 1, 2, 3
	 *  6, 7, 1, 2, 3, 4, 5
	 *  3, 4, 5, 6, 7, 1, 2
	 */
	
	
	public int modBinarySearch (int[] a, int element, int indexLeft, int indexRight) {
		
		if (indexLeft>indexRight) return -1; // doesn't exist
		int mid = (indexLeft+indexRight)/2; // get the mid index
		if (a[mid]==element) return mid;
		
		if (a[mid]>=a[indexLeft]) { // like: 4,5,6,7,1,2,3
			if (element<a[mid]&&element>a[indexLeft]){
				return modBinarySearch(a, element, indexLeft, mid-1);
			}
			else{
				return modBinarySearch(a, element, mid+1, indexRight);
			}
		}
		else {  // like: 6,7,1,2,3,4,5
			if (element>a[mid]&&element<a[indexRight]){
				return modBinarySearch(a, element, mid+1, indexRight);
			}
			else{
				return modBinarySearch(a, element, indexLeft, mid-1);
			}
		}
	}
}

/**
 *  if the array has duplicate entries then we cannot do better than O(n), which is as good as linear search
 */
	
	
	

