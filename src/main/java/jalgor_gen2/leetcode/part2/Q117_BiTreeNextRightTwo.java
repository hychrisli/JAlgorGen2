package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeLinkNode;

public class Q117_BiTreeNextRightTwo extends Solution {

    public void connect(TreeLinkNode root) {
	TreeLinkNode lvlHead = root;

	while (lvlHead != null) {

	    TreeLinkNode nxtLvlHead = new TreeLinkNode(0);
	    TreeLinkNode cur = lvlHead;
	    TreeLinkNode nxtCur = nxtLvlHead;

	    while (cur != null) {

		if (cur.left != null) {
		    nxtCur.next = cur.left;
		    nxtCur = nxtCur.next;
		}
		if (cur.right != null) {
		    nxtCur.next = cur.right;
		    nxtCur = nxtCur.next;
		}

		cur = cur.next;
	    }

	    lvlHead = nxtLvlHead.next;
	}
    }
}
