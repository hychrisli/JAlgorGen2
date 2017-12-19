package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q098_ValidBst extends Solution {
    
    Integer pre = null;
    
    public boolean isValidBST(TreeNode root) {
	
	if (root == null) return true;
	
	if (! isValidBST(root.left))
	    return false;
	
	if (pre != null && root.val <= pre) return false;
	else pre = root.val;
	
	if (! isValidBST(root.right))
	    return false;
	
	return true;
    }  
}
