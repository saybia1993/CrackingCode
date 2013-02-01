
// if you have a 2GB file with one string per line, which sorting algorithm would you use to sort the file and why?


public class four {

	/**
	 * When an interview gives a size of 2GB, it should tell you that they DON'T want you to bring all the data into memory
	 * So, we only bring part of the data into memory
	 * 
	 * 1. divide file into K chunks, each have X size (MB level), K * X = 2GB
	 * 2. bring each chunk into memory, using any O(nlogn) algorithm to sort, save the chunk back to the file
	 * 3. merge each chunk one by one
	 * 
	 */
	
}
