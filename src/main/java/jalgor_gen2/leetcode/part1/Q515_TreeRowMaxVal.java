package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.List;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q515_TreeRowMaxVal extends Solution {
    
	public List<Integer> largestValues(TreeNode root){
		// Recursion
		List<Integer> res = new ArrayList<Integer>();
		helper(res, 0, root);
		return res;
	}
	
	private void helper(List<Integer> res, int level, TreeNode root){
		if ( root == null) return;
		
		if ( res.size() <= level)
			res.add(root.val);
		else
			res.set(level, Math.max(res.get(level), root.val));
		helper(res, level + 1, root.left);
		helper(res, level + 1, root.right);
	}
	
	
	public List<Integer> largestValues_v1(TreeNode root) {
    	// Iteration by level. Slow
    	List<Integer> res = new ArrayList<Integer>();
    	if ( root == null) return res;
    	
    	List<TreeNode> level = new ArrayList<TreeNode>();
    	level.add(root);
    	
    	while ( !level.isEmpty() ){
    		
    		List<TreeNode> nextLevel = new ArrayList<TreeNode>();
    		int maxVal = Integer.MIN_VALUE;
    		
    		for ( TreeNode node : level){
    			maxVal = Math.max(maxVal, node.val);
    			if (node.left != null) 
    				nextLevel.add(node.left);
    			if (node.right != null)
    				nextLevel.add(node.right);
    		}
    		res.add(maxVal);
    		level = nextLevel;
    	}
    	
    	return res;
    }
}
