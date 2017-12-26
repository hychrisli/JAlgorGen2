package jalgor_gen2.leetcode.lint;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q085_InsertBst extends Solution {

    public TreeNode insertNode(TreeNode root, TreeNode node) {
        
	TreeNode curNode = root, pNode = null;
	
	while ( curNode != null ) {
	    pNode = curNode;
	    
	    if ( node.val < curNode.val )
		curNode = curNode.left;
	    else
		curNode = curNode.right;
	}
	
	if ( pNode == null ) return node;
	
	if ( node.val < pNode.val) pNode.left = node;
	else pNode.right = node;
	
	return root;
    }
    
}
