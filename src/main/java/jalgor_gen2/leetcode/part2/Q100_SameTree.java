package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.TreeNode;

public class Q100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
     
	if ( p == null && q == null ) return true;
	if ( p == null || q == null ) return false;
	if ( p.val == q.val)
	    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	else
	    return false;
    }
}
