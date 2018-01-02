package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.List;

import jalgor_gen2.leetcode.Solution;

public class Q046_Permutation extends Solution{
    
    public List<List<Integer>> permute(int[] nums) {

	List<List<Integer>> res = new ArrayList<List<Integer>>();
	backtrack(res, new ArrayList<Integer>(), nums);
	return res;
    }
    
    private static void backtrack( List<List<Integer>> res, List<Integer> tmpLst, int[] nums) {
	
	if ( tmpLst.size() == nums.length) {
	    res.add( new ArrayList<Integer>(tmpLst));
	} else { 
	    for ( int i = 0; i < nums.length; i++ ) {
		if ( !tmpLst.contains(nums[i])) {
		    tmpLst.add(nums[i]);
		    backtrack(res, tmpLst, nums);
		    tmpLst.remove(tmpLst.size() - 1);
		}
	    }
	}
    }
}
