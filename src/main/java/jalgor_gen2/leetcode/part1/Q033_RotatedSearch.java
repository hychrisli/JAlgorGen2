package jalgor_gen2.leetcode.part1;

import jalgor_gen2.leetcode.Solution;

public class Q033_RotatedSearch extends Solution {
    public int search(int[] nums, int target) {
        
    	int si = 0, ei = nums.length - 1;
    	
    	while (si <= ei){
    		int mid = (si + ei) / 2;
    		if ( target == nums[mid]) return mid;
    		
    		if ( nums[mid] < nums[ei] )
    			if (target > nums[mid] && target <= nums[ei] )
    				si = mid + 1;
    			else
    				ei = mid - 1;
    		else
    			if (target >= nums[si] && target < nums[mid])
    				ei = mid - 1;
    			else
    				si = mid + 1;
    		
    	}
    	return -1;
    }
}
