package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q114_FlatternBiTreeToLinkedList extends Solution{
    
    public void flatten(TreeNode root) {
	preOrder(root);
    }
    
    private static TreeNode preOrder (TreeNode root) {
	
	if (root == null) return null;
	
	TreeNode leftEnd = preOrder(root.left);
	TreeNode rightEnd = preOrder(root.right);
	if ( leftEnd != null) {
	    leftEnd.right = root.right;
	    root.right = root.left;
	}
	root.left = null;
	
	TreeNode end = rightEnd == null ? ( leftEnd == null ? root : leftEnd ) : rightEnd;
	
	return end;
    }
    
}
