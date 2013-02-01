
// write a program to swap odd and even bits in an integer with as few instructions as possible (0and1, 2and3)


public class six {
	
	public int swap (int a, int b){
		return (((a & 0xaaaaaaaa)>>1)|((b & 0x55555555)<<1));
		
	}
	
	// 10101010101010101010101010101010 == 0xaaaaaaaa
	// 01010101010101010101010101010101 == 0x55555555
	
}
