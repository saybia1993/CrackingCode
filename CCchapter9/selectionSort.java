
// implement a selection sort
// Find the smallest element using a linear scan and move it to the front, then find the second smallest and move it again.
// Continue doing this until all the elements are in place O(n^2)


public class selectionSort {
	
	public int[] sort (int[] arr){
		int temp =0;
		for (int i=0; i<arr.length-1; i++){
			for (int j=i+1; j<arr.length; j++){
				if (arr[j]<arr[i]){ // exchange two element
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; // arrange from small to large
				}
			}
		}
		return arr;
	}
}
