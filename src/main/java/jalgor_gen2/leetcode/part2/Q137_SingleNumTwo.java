package jalgor_gen2.leetcode.part2;

public class Q137_SingleNumTwo {

    public int singleNumber(int[] nums) {
	int ones = 0, twos = 0;

	for ( int num : nums) {
	    
	    //System.out.println("num: " + Integer.toBinaryString(num));
	    //System.out.println("ones: " + Integer.toBinaryString(ones));
	    //System.out.println("ones ^ num: " + Integer.toBinaryString(ones ^ num));
	    //System.out.println("twos: " + Integer.toBinaryString(twos));
	    //System.out.println("~ twos: " + Integer.toBinaryString(~twos).substring(30));
	    
	    ones = ones ^ num & ~twos;
	    //System.out.println("after ones: " + Integer.toBinaryString(ones));
	    
	    twos = twos ^ num & ~ones;
	}
	
	return ones;
    }

}
