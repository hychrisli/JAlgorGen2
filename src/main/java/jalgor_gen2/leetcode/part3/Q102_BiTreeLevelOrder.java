package jalgor_gen2.leetcode.part3;

import java.util.ArrayList;
import java.util.List;

import jalgor_gen2.structure.TreeNode;

public class Q102_BiTreeLevelOrder {
    
    public List<List<Integer>> levelOrder(TreeNode root){
	
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	if ( root != null ) res = traverse(res, 0, root);
	return res;
    }
    
    
   public List<List<Integer>> traverse( List<List<Integer>> res, int depth, TreeNode root){
       
       if ( res.size() <= depth ) res.add(new ArrayList<Integer>());
       
       res.get(depth).add(root.val);
       if ( root.left != null ) traverse(res, depth + 1, root.left);
       if ( root.right != null ) traverse(res, depth + 1, root.right);
       
       return res;
   }
    
    
    
    // kinda slow
    public List<List<Integer>> levelOrderV1(TreeNode root) {
        
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	List<TreeNode> curLvl = new ArrayList<TreeNode>(), nxtLvl;
	
	if ( root != null ) curLvl.add(root);
	
	while ( curLvl.size() != 0) {
	    
	    List<Integer> curLvlRes = new ArrayList<Integer>();
	    nxtLvl = new ArrayList<TreeNode>();
	    
	    for ( TreeNode node : curLvl) {
		
		curLvlRes.add(node.val);
		
		if ( node.left != null ) nxtLvl.add(node.left);
		if ( node.right != null ) nxtLvl.add(node.right);
	    }
	    
	    res.add(curLvlRes);
	    
	    curLvl = nxtLvl;
	}
	return res;
    }
    
}
