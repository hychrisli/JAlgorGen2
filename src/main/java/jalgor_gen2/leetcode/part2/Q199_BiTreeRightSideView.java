package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import jalgor_gen2.structure.TreeNode;

public class Q199_BiTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {

	List<Integer> res = new ArrayList<Integer>();
	
	if (root == null)
	    return res;

	Queue<TreeNode> lvl = new LinkedList<TreeNode>();
	Queue<TreeNode> nlvl = new LinkedList<TreeNode>();

	lvl.add(root);

	while (!lvl.isEmpty()) {
	    TreeNode node = lvl.poll();
	    if (node.left != null)
		nlvl.add(node.left);
	    if (node.right != null)
		nlvl.add(node.right);
	    if (lvl.isEmpty()) {
		res.add(node.val);
		Queue<TreeNode> tmp = lvl;
		lvl = nlvl;
		nlvl = tmp;
	    }
	}
	
	return res;
    }

}
