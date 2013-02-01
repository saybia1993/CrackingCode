
// implement a bubble sort
// Start at the beginning of an array and swap the first two elements if the first is bigger than the second
// Go to the next pair, etc.  O(n^2)


public class bubbleSort {

	
	public int[] sort(int[] arr){
		boolean ifSwapped = true;  // record if swapped
		int j=0;  // count down
		int temp = 0;
		while (ifSwapped){  // each big loop
			ifSwapped = false; // assume next loop won't swap
			j++;
			for (int i = 0; i<arr.length-j; i++){
				if (arr[i]>arr[i+1]){
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;   // swapped
					ifSwapped = true;  // this round swapped happend, we need another while round to check
				}
			}
		}
		return arr;
	}
	
	
	
	
}
