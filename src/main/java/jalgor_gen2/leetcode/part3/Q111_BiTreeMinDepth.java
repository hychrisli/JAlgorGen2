package jalgor_gen2.leetcode.part3;

import java.util.LinkedList;
import java.util.Queue;

import jalgor_gen2.structure.TreeNode;

public class Q111_BiTreeMinDepth {
    public int minDepth(TreeNode root) {
     
	if ( root == null ) return 0;
	
	Queue<TreeNode> curQ = new LinkedList<TreeNode>();
	Queue<TreeNode> nextQ = new LinkedList<TreeNode>();
	curQ.add(root);
	int depth = 0;
	
	while (!curQ.isEmpty()) {
	    
	    TreeNode node = curQ.poll();
	    if ( node.left == null && node.right == null) {
		return depth + 1;
	    }
	    
	    if ( node.left != null ) nextQ.add(node.left);
	    if ( node.right != null ) nextQ.add(node.right);
	    
	    if ( curQ.isEmpty()) {
		Queue<TreeNode> tmp = curQ;
		curQ = nextQ;
		nextQ = tmp;
		depth ++;
	    }
	}
	
	return depth;
    }
}
