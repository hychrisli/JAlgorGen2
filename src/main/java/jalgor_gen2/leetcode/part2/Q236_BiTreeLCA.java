package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.TreeNode;

public class Q236_BiTreeLCA {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
	if ( root == null ) return null;
	
	TreeNode left = lowestCommonAncestor(root.left, p, q);
	TreeNode right = lowestCommonAncestor(root.right, p, q);
	
	boolean isP = root == p || left == p || right == p;
	boolean isQ = root == q || left == q || right == q;
	
	// common ancestor found
	if ( isP && isQ )  return root;
	
	// p, q pass through
	if ( isP ) return p;
	if ( isQ ) return q;
	
	// common ancestor pass through
	if ( left != null ) return left;
	if ( right != null ) return right;
	
	return null;
    }
    
}
