package jalgor_gen2.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q040_CombineSumII extends Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	Arrays.sort(candidates);
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	this.helper(candidates, target, 0, res, new ArrayList<Integer>());
    	return res;
    }
    
    private void helper (int[] candids, int target, int start,
    		List<List<Integer>> res, List<Integer> elem) {
    	
    	if ( target == 0 ) {
    		// log.info(start + ", " + Arrays.toString(elem.toArray()));
    		res.add(new ArrayList<Integer>(elem));
    		return;
    	}
    	
    	if ( start >= candids.length || target < candids[start])
    		return;
    		    	
    	for ( int i = start; i < candids.length; i ++ ){
    		if ( i > start && candids[i] == candids[i-1]) continue;
    		
    		elem.add(candids[i]);
    		this.helper(candids, target - candids[i], i + 1, res, elem);
    		elem.remove(elem.size() - 1);
    	}
    }
    
}
