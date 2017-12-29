package jalgor_gen2.leetcode.part2;

import java.util.LinkedList;
import java.util.Queue;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q110_BalancedBiTree extends Solution {

    
    boolean isBal = true;
    
    public boolean isBalanced(TreeNode root) {
	getDepth(root);
	return isBal;
    }
    
    public int getDepth(TreeNode root) {
	
	if ( root == null || ! isBal ) return 0;
	
	int lDepth = getDepth(root.left);
	int rDepth = getDepth(root.right);
	
	if ( Math.abs(lDepth - rDepth) > 1)
	    isBal = false;
	
	return Math.max(lDepth, rDepth) + 1;
    }
    
    
    // Wrong Approach BFS
    // test 5 failed
    public boolean isBalancedWrong(TreeNode root) {

	boolean hasNull = false;
	Queue<TreeNode> curQ = new LinkedList<TreeNode>();

	if ( root != null) curQ.add(root);

	while (!curQ.isEmpty()) {

	    Queue<TreeNode> nextQ = new LinkedList<TreeNode>();
	    boolean nextNull = false;

	    while (!curQ.isEmpty()) {

		TreeNode node = curQ.poll();
		
		if ( node.left != null ) {
		    if (hasNull) return false;
		    nextQ.add(node.left);
		} else 
		    nextNull = true;
		
		if ( node.right != null ) {
		    if (hasNull) return false;
		    nextQ.add(node.right);
		} else 
		    nextNull = true;
	    }
	    curQ = nextQ;
	    hasNull = nextNull;
	}

	return true;
    }
}
