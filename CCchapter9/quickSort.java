
// implement a quick sort
// VERY IMPORTANT!! Pick a random element and partition the array, such that all numbers that are less than it come before all
// elements that are greater than it. Then do that for each half, then each quarter, etc.
// O(nlogn) expected, O(n^2) worst case

public class quickSort {
	
	public int[] sort(int[] arr, int p, int r){ // (p: head index, r: tail index) for the part of array
		if (p<r) {
			int q = partition(arr, p, r); // q is the pivot point
			sort(arr, p, q-1);
			sort(arr, q+1, r);
		}
		return arr;
	}
	
	public int partition (int[] arr, int p, int r){ // (p: head index, r: tail index) for the part of array
		int i = p-1;  // i hold the index of numbers with smaller than the pivot point
		int temp;
		for (int j = p; j<=r-1; j++){  // j: p to r-1
			if (arr[j]<arr[r]){  // compare i with last value of the array
				i = i+1;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp; // exchange arr[i] with arr[j]
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;  // put pivot point in the right place
		return i+1;  // return the index of pivot point
	}
	
}
