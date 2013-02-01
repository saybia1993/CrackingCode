
// rotate the NxN matrix for 90 degrees, or do this in place

public class six {

	public static void main(String[] args){
		//null
	}
	/**
	 *  method 1, not do in place, create another NxN matrix, left to top
	 */
	public static void move(int[][] matrix, int n){
		
	}
	
	/**
	 *  method 2, do in place, perform a cyclic swap on the edges on each layer
	 * |0 0 0 0 0 0 0 0 0|0
	 *  0                 0     1 1 1 1 1 1 1
	 *  0                 0     1           1     2 2 2 2 2 
	 *  0                 0     1           1     2       2
	 *  0                 0     1           1     2       2
	 *  0                 0     1           1     2       2
	 *  0                 0     1           1     2 2 2 2 2 
	 *  0				  0	    1 1 1 1 1 1 1 
 	 *  0 0 0 0 0 0 0 0 0 0 
	 *  That's it.
	 */
	public static void rotation(int[][] matrix, int n){
		
		for (int layer = 0; layer <n/2; layer++){
			
			for (int i= layer; i<n-1-layer; i++){  // attention: last number is not changed by this line. move point one by one
				
				int top = matrix[layer][i]; // save the top
				
				matrix[layer][i] = matrix[n-1-layer-i][layer];  // left to top
				
				matrix[n-1-layer-i][layer] = matrix[n-1-layer][n-1-layer-i]; // bottom to left
				 
				matrix[n-1-layer][n-1-layer-i] = matrix[i][n-1-layer]; // right to bottom
				
				matrix[i][n-1-layer] = top; // top to right
			}
			
		}
		
	}

}
