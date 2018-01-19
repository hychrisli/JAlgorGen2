package jalgor_gen2.leetcode.part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import jalgor_gen2.structure.TreeNode;

public class Q107_BiTreeLevelOrderTwo {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
	List<List<Integer>> res = new LinkedList<List<Integer>>();
	Queue<TreeNode> q = new LinkedList<TreeNode>();
	int curLvlCnt = 0, nxtLvlCnt = 0;
	
	if ( root != null ) {
	    q.add(root);
	    curLvlCnt = 1;
	}
	
	
	while ( curLvlCnt > 0) {
	    
	    List<Integer> lvlRes = new ArrayList<Integer>();
	    while ( curLvlCnt > 0) {
		TreeNode node = q.poll();
		lvlRes.add(node.val);
		
		if ( node.left != null) {
		    q.add(node.left);
		    nxtLvlCnt ++;
		}
		
		if ( node.right != null ){
		    q.add(node.right);
		    nxtLvlCnt ++;
		}
		
		curLvlCnt --;
	    }
	    
	    res.add(0, lvlRes);
	    curLvlCnt = nxtLvlCnt;
	    nxtLvlCnt = 0;
	}
	
	return res;
    }
    
}
