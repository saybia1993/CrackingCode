
// You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B
// write a method to merge B into A in sorted order.


public class one {

	public void merge (int[] a, int[] b, int aLength, int bLength){
		int k = aLength+bLength-1; //last index of a+b (in array a)
		int i = aLength-1; // last index of a (in array a)
		int j = bLength-1; // last index of b (in array b)
		
		while (i>=0 && j>=0){  // we merge b into a
			if(a[i] > b[j]){
				a[k--] = a[i--];  // equals to a[k] = a[i], k--, i--
			}
			else {
				a[k--] = b[j--];
			}
		}
		while (j>=0) {  // check if b end (we do not need to check a, since we merge b into a)
			a[k--] = b[j--];
		}
	}
}
