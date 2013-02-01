
// You are given two 32-bit numbers, N and M and two bit positions, i and j,
// write a method to set all bits between i and j in N equal to M
// example: input: N=10000000000, M=10101, i=2, j=6
// output: N=10001010100
//               ^   ^
//               6   2 0
//               j   i

public class one {
	
	public int updateBits(int n, int m, int i, int j){
		
		int max = ~0; // all 1
		
		int left = max - ((1<<j+1)-1); // 1s from left to j, then all 0
		
		int right = (1<<i) - 1;  // 1s after i to right
		
		int mask = left | right ; // combine : 11110000011
		
		return (n & mask)|(m<<i); // (n&mask): clear i through j, |(m<<i): put m in there
	
	}

}
