package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.TreeNode;

public class Q129_SumRoot2LeafNum {
    
    
    public int sumNumbers(TreeNode root) {
	return sum(root, 0);
    }
    
    private static int sum ( TreeNode root, int val) {
	if ( root == null ) return 0;
	
	if ( root.left == null && root.right == null) return val * 10 + root.val;
	
	return sum(root.left, val * 10 + root.val) + sum(root.right, val * 10 + root.val);
    }
    
    
    // version one, a little redundant
    int sum;
    
    public int sumNumbersV1(TreeNode root) {
	if ( root == null ) return 0;
	
	sum = 0;
	backtrack(root, 0);
	return sum;
    }
    
    private void backtrack(TreeNode root, int val) {
	
	val = val * 10 + root.val - '0';
	
	if ( root.left != null )
	    backtrack(root.left, val);
	
	if ( root.right != null)
	    backtrack(root.right, val); 

	if ( root.right == null && root.left == null )
	    sum += val;
    }
    
}
