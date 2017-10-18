package jalgor_gen2.leetcode.part1;

import java.util.LinkedList;
import java.util.Queue;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q513_TreeBottomLeft extends Solution {
    public int findBottomLeftValue(TreeNode root) {
        
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
    	TreeNode last = root;
    	
    	while(!q.isEmpty()){
    		last = q.poll();
    		if (last.right != null) q.add(last.right);
    		if (last.left != null) q.add(last.left);
    	}
    	
    	return last.val;
    }
}
