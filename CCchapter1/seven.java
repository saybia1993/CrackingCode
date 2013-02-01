
// if an element in an MxN matrix is 0, its entire row and column is set to 0

public class seven {

	public static void main(String[] args){
			
	}
	
	/**
	 *  method 1, use another matrix to store the zero cell, pass through second matrix to set the first matrix
	 */
	public static void copyMatrix(int[][] matrix){
		
	}
	
	
	/**
	 *  method 2, based on each cell, test if either the row or the column has an zero
	 */
	public static void setZero(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		for (int i=0; i<matrix.length; i++){    // iterate every row
			for (int j=0; j<matrix[0].length; j++){  // iterate every column
				if (matrix[i][j] == 0) {
					row[i] =1;     // means that row has at least an zero
					column[j]=1;   // means that column at least has an zero
				}
			}
		}
		for (int i=0; i<matrix.length; i++){    // iterate every row
			for (int j=0; j<matrix[0].length; j++){  // iterate every column
				if ((row[i]==1)| (column[j]==1)){   // either row[i] or column[j] is 1, set matrix[i][j] to zero
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	
}
