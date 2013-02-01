

// given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height


public class three {  // actually, this class implement a completed binary tree based on the array, 
	

	
	// method, create the increasing order array
	public static int[] createArray (int value){
		int[] array = new int[value+1];
		for (int i=1; i<value+1; i++) array[i] =i;
		return array;
	}

	// method
	public static void createTree(int[] array){  // value =100, 1-100 in sorted order
		int value = array.length-1;
		int noneLeaf = (int)Math.floor(value/2);  // Remember begin from index 1
		node current = new node(array[1]);
		node[] nodeArray = new node[array.length];
		nodeArray[1] = current;
		for (int i=1; i<=noneLeaf; i++){
			current = nodeArray[i];
			nodeArray[2*i] = current.createLeftChild(array[2*i]);
			nodeArray[2*i+1] = current.createRightChild(array[2*i+1]);
		}
	}
	
	
	// test
	public static void main(String[] args){
		int[] a = createArray(100);
		createTree(a);
		
		
	}
	
	
}
