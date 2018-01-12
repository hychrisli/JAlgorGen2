package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.TreeNode;

public class Q101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
	return compare(root, root);
	
    }
    
    private boolean compare(TreeNode left, TreeNode right) {
	
	if ( left == null && right == null) return true;
	if ( left == null || right == null) return false;
	
	return left.val == right.val && compare(left.left, right.right) && compare(left.right, right.left);
	
    }
    
}
