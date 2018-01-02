package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jalgor_gen2.leetcode.Solution;

public class Q047_PermutationsTwo extends Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
	boolean[] used = new boolean[nums.length];
	Arrays.sort(nums);
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	backtrack(res, new ArrayList<Integer>(), used, nums);
	return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> tmpLst, boolean[] used, int[] nums) {
	if (tmpLst.size() == nums.length) {
	    res.add(new ArrayList<Integer>(tmpLst));
	} else {
	    for (int i = 0; i < nums.length; i++) {
		// values is used
		// Or value is not the first of the same values
		if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]))
		    continue;
		tmpLst.add(nums[i]);
		used[i] = true;
		backtrack(res, tmpLst, used, nums);
		tmpLst.remove(tmpLst.size() - 1);
		used[i] = false;
	    }
	}
    }
}
