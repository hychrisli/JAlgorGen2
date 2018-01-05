package jalgor_gen2.leetcode.part2;

public class Q136_SingleNum {

    public int singleNumber(int[] nums) {
        
	int res = 0;
	
	for ( int num : nums) 
	    res ^=num;
	
	return res;
    }
}
