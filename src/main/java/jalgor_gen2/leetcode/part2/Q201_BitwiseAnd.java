package jalgor_gen2.leetcode.part2;

public class Q201_BitwiseAnd {
    
    // finding the common ancestor in binary
    public int rangeBitwiseAnd(int m, int n) {
	int shift = 0;
	while ( m != n ) {
	    m >>= 1;
	    n >>= 1;
	    shift += 1;
	}
	return m << shift;
    }
}
