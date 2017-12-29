package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.ListNode;
import jalgor_gen2.structure.TreeNode;

public class Q109_SortedList2Bst extends Solution {

    public TreeNode sortedListToBST(ListNode head) {
       
	if ( head == null ) return null;
	
	TreeNode root = new TreeNode(0);
	int len = 0;
	ListNode curNode = head;
	while( curNode != null ) {
	    len += 1;
	    curNode = curNode.next;
	}
	helper(head, len, root);
	return root;
    }
    
    
    private static ListNode helper(ListNode head, int len, TreeNode root) {
	
	if ( len == 1 ) {
	    // System.out.println("leaf: " + head.val);
	    root.val = head.val;
	    return head.next;
	}
	
	ListNode curNode = head;
	root.left = new TreeNode(0);
	int lLen = len / 2;
	
	curNode = helper(curNode, lLen, root.left);
	root.val = curNode.val;
	// System.out.println("root: " + curNode.val);
	
	curNode = curNode.next;
	int rLen = len - lLen - 1;
	
	if ( rLen > 0 ) {
	    root.right = new TreeNode(0);
	    curNode = helper(curNode, rLen, root.right);
	}

	return curNode;
    }
    
}
