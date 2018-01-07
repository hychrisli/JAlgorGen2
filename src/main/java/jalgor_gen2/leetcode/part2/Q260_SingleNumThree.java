package jalgor_gen2.leetcode.part2;

public class Q260_SingleNumThree {

    public int[] singleNumber(int[] nums) {
        
	// XOR all elements
	int res = 0;
	
	for ( int i = 0; i < nums.length; i++) {
	    res ^= nums[i];
	}
	
	// Last set bit;
	res &= -res;
	int[] two = new int[2];

	for( int i = 0; i < nums.length; i++) {
	    if ( (res & nums[i]) == 0) {
		two[0] ^= nums[i];
	    } else {
		two[1] ^= nums[i];
	    }
	    
	}
	return two;
    }
    
}
