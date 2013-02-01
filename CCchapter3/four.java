
// Tower of Hanoi, implementation
// Recursion problem


public class four { // four represent "tower"

	// attributes of the object of class "four" (tower)
	private Stack disks;
	private int noOfPlates;	
	
	// constructor
	public four(int noOfPlates){
		disks = new Stack(noOfPlates);
		this.noOfPlates = noOfPlates;
	}
	
	// method
	public void fillTheTower(){
		for (int i=0; i<noOfPlates; i++){ // fill the stack in index of the corresponding blank, 0-0, 1-1, 2-2
			disks.push(i);
		}
	}
	
	// method
	public void addTheTower(Object j){
		disks.push(j);
	}
	
	// method
	public int reNoOfPlates(){
		return noOfPlates;
	}
	
	// method
	public int reTopPlates(){
		int i =(Integer)disks.peek();   // topPlates should be NoofPlates - 1
		return i;
	}
	
	// method
	public void moveTopTo(four t){
		Object temp = disks.pop();
		t.addTheTower(temp);
	}
	
	// method IMPORTANT!!
	public void moveDisk(int n, four destination, four buffer){ // number of plates to move, the destination rod, the buffer rod
		if (n>0){
			moveDisk(n-1, buffer, destination);
			moveTopTo(destination);  // operation in each recursion
			moveDisk(n-1, destination, buffer);
		}	
	}
	
	
	
	
	//test
	public static void main(String[] args){
		four f = new four(4);
		int j = f.reNoOfPlates();
		int k = f.reTopPlates();
		System.out.println(j);
		System.out.println(k);
	} // test
	
}
