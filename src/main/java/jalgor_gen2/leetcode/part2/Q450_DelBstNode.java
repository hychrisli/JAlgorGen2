package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.TreeNode;

public class Q450_DelBstNode extends Solution {

    // recursive
    public TreeNode deleteNode(TreeNode root, int key) {

	if (root == null)
	    return null;

	if (root.val > key)
	    root.left = deleteNode(root.left, key);
	else if (root.val < key)
	    root.right = deleteNode(root.right, key);
	else {

	    if (root.left == null)
		return root.right;
	    if (root.right == null)
		return root.left;

	    TreeNode next = root.right;
	    while (next.left != null)
		next = next.left;
	    next.left = root.left;
	    return root.right;
	}
	return root;
    }

    // iterative
    public TreeNode deleteNodeV1(TreeNode root, int key) {

	TreeNode curNode = root, head = new TreeNode(0), pNode = head;
	boolean isPLeft = false;
	pNode.right = root;

	while (curNode != null && curNode.val != key) {
	    pNode = curNode;
	    if (key < curNode.val) {
		curNode = curNode.left;
		isPLeft = true;
	    } else {
		curNode = curNode.right;
		isPLeft = false;
	    }
	}

	// Empty Tree or node not found
	if (curNode == null)
	    return root;

	// leaf node
	if (curNode.left == null && curNode.right == null)
	    replace(pNode, null, isPLeft);
	// only right child
	else if (curNode.left == null)
	    replace(pNode, curNode.right, isPLeft);
	// only left child
	else if (curNode.right == null)
	    replace(pNode, curNode.left, isPLeft);
	// both children
	else {

	    TreeNode next = curNode.right, pNext = pNode;
	    while (next.left != null) {
		pNext = next;
		next = next.left;
	    }

	    // curNode right is the successor
	    if (pNext == pNode)
		next.left = curNode.left;
	    // curNode right is not the successor
	    else {
		pNext.left = next.right;
		next.left = curNode.left;
		next.right = curNode.right;
	    }

	    replace(pNode, next, isPLeft);
	}

	// System.out.println(head.right.toString());

	return head.right;
    }

    private static void replace(TreeNode p, TreeNode child, boolean isLeft) {
	if (isLeft)
	    p.left = child;
	else
	    p.right = child;
    }

}
