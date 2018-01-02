package jalgor_gen2.leetcode.part2;

import java.util.LinkedList;
import java.util.Queue;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeLinkNode;

public class Q116_BiTreeNextRight extends Solution{

    public void connect(TreeLinkNode root) {
	TreeLinkNode lvlHead = root;
	while ( lvlHead != null ) {
	    TreeLinkNode cur = lvlHead;
	    while ( cur != null ) {
		if (cur.left != null) cur.left.next = cur.right;
		if (cur.right != null && cur.next != null)
		    cur.right.next = cur.next.left;
		cur = cur.next;
	    }
	    lvlHead = lvlHead.left;
	}
    }
    
    // Too much space
    public void connectV1(TreeLinkNode root) {
        
	if ( root == null ) return;
	
	Queue<TreeLinkNode> q = new LinkedList<TreeLinkNode>();
	Queue<TreeLinkNode> nq = new LinkedList<TreeLinkNode>();
	q.add(root);
	
	while ( !q.isEmpty() ) {
	    TreeLinkNode node = q.poll();
	    node.next = q.peek();
	    
	    if ( node.left != null ) nq.add(node.left);
	    if ( node.right != null ) nq.add(node.right);
	    
	    if ( q.isEmpty()) {
		q = nq;
		nq = new LinkedList<TreeLinkNode>();
	    }
	}
    }
}
