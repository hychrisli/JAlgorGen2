package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.TreeNode;

public class Q222_CountCompleteTreeNodes {
    
    
    private int height(TreeNode root) {
	return root == null ? -1 : height(root.left) + 1;
    }
    
    
    public int countNodes(TreeNode root) {
	int nodes = 0, h = height(root);
	
	while ( root != null) {
	    
	    if ( height(root.right) == h - 1) {
		nodes += 1 << h;
		root = root.right;
	    } else {
		nodes += 1 << h - 1;
		root = root.left;
	    }
	    
	    h--;
	}
	return nodes;
    }
}
