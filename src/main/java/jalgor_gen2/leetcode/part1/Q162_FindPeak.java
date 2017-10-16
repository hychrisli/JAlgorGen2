package jalgor_gen2.leetcode.part1;

import jalgor_gen2.leetcode.Solution;

public class Q162_FindPeak extends Solution {
    public int findPeakElement(int[] nums) {
        
    	int n = nums.length - 1, si = 0, ei = n;
    	
    	while ( si <= ei ){
    		int mid = (si + ei )/ 2;
    		if ( mid == 0 || nums[mid] > nums[mid-1])
    			if (mid == n || nums[mid] > nums[mid + 1])
    				return mid;
    			else
    				si = mid + 1;
    		else
    			ei = mid -1;
    	}
    	return -1;
    }
}
