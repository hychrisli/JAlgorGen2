package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q530_MinAbsDiff extends Solution {

    double minDiff = Math.abs((double)Integer.MIN_VALUE);
    Integer pre = null;
    
    public int getMinimumDifference(TreeNode root) {
	if (root == null) return (int) minDiff;
	
	getMinimumDifference(root.left);
	if (pre != null && Math.abs(root.val - pre) < minDiff)
	    minDiff = Math.abs(root.val - pre);
	pre = root.val;
	getMinimumDifference(root.right);
	
	return (int) minDiff;
    }
}
