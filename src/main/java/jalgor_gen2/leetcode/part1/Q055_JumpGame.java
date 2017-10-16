package jalgor_gen2.leetcode.part1;

import jalgor_gen2.leetcode.Solution;

public class Q055_JumpGame extends Solution {
    public boolean canJump(int[] nums) {
        
    	int idx = 0, imax = idx + nums[0];
    	
    	while ( imax < nums.length && idx <= imax){
    		
    		imax = Math.max(idx + nums[idx], imax);
    		idx += 1;	
    	}
    	
    	return imax >= nums.length - 1 ? true : false;
    }
}
