
// given a matrix in which each row and each column is sorted, write a method to find an element in it.
// rows are sorted left to right in ascending order, columns are sorted top to bottom in ascending order
// matrix size is M*N

public class six {
	
	/**
	 *  this algorithm works by elimination, the top-right and bottom-left points are the only two point which
	 *  could approach.
	 *  we start at top-right point, every move to the left could eliminate all the elements below original cell
	 *  every move down could eliminate all the elements on the left
	 */
	
	public int[] findElement (int[][] matrix, int element, int m, int n ){
		
		int IndexRow = 0;
		int IndexColumn = n-1;
		int[] result = new int[2];
		while (IndexRow<m && IndexColumn >=0){
			if(matrix[IndexRow][IndexColumn] == element) {  // find the element
				result[0]= IndexRow;
				result[1]= IndexColumn;
				return result;
			}
			else if (matrix[IndexRow][IndexColumn]>element){
				IndexColumn--;   // move left
			}
			else {     // matrix[IndexRow][IndexColumn]<element
				IndexRow++;  // move down
			}
		}
		result[0]=-1;
		result[1]=-1;
		return result;  // doesn't exist
	}
	
	
	
}
