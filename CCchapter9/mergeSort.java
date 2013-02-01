
// implement a merge sort
// Sort each pair of the elements, then  sort every four elements by merging every two pairs, etc
// O(nlogn) expected and worst case


import java.util.*;

public class mergeSort {
	
	public int[] sort(int[] arr){
		if (arr.length==1){
			return arr;  // no use sorting, each array hold only one element
		}
		else{
			int lower = 0;   // index of arr
			int upper = arr.length-1;  // index of arr
			int mid = (int)Math.floor((lower+upper)/2); // get the mid point
			int[] subArrLeft = Arrays.copyOfRange(arr, lower, mid);  // each recursion divide arr into two arrays
			int[] subArrRight = Arrays.copyOfRange(arr, mid+1, upper);
			sort(subArrLeft);
			sort(subArrRight);
			arr = merge(subArrLeft, subArrRight);
		}
		return arr;  // return the final arr
	}
	
	public int[] merge(int[] arr1, int[] arr2){
		int arrLength1 = arr1.length;
		int arrLength2 = arr2.length; // arrLength1 could equal to arrLength2 or arrLength2+1
		int i = 0; // index for arr1
		int j = 0; // index for arr2
		int [] newArr = new int[arrLength1+arrLength2];
		for (int k=0; k<newArr.length; k++){ // IMPORTANT, follow the newArr's index, compare arr1 and arr2 each time
			if (arr1[i]<arr2[j]){
				newArr[k] = arr1[i];
				i+=1;
			}
			else {
				newArr[k] = arr2[j];
				j+=1;
			}
		}
		return newArr;  // arr1 and arr2 are sorted in newArr 
	}
	
}
