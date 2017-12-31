package jalgor_gen2.leetcode.part2;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

// https://leetcode.com/problems/longest-increasing-subsequence/discuss/74824

public class Q300_MaxIncreaseSubseq extends Solution{
    
    public int lengthOfLIS(int[] nums) {
        
	if ( nums.length < 1) return 0;
	
	int[] tails = new int[nums.length];
	tails[0] = nums[0];
	int size = 1;
	
	for ( int num : nums) {
	    // System.out.println(Arrays.toString(tails));
	    if (num > tails[size - 1]) {
		tails[size] = num;
		size += 1;
	    } else if (num < tails[size - 1]){
		
		int lo = 0, hi = size - 1;
		while ( lo < hi ) {
		    int mid = ( lo + hi ) / 2;
		    if ( num < tails[mid]) {
			hi = mid;
		    } else if (num > tails[mid]){
			lo = mid + 1;
		    } else {
			lo = mid;
			break;
		    }
		}
		// System.out.println( lo + ": " + num);
		tails[lo] = num;
	    }
	}
	return size;
    }
}
