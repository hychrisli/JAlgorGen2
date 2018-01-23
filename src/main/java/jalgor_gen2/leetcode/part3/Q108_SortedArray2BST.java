package jalgor_gen2.leetcode.part3;

import jalgor_gen2.structure.TreeNode;

public class Q108_SortedArray2BST {
    public TreeNode sortedArrayToBST(int[] nums) {
	return build(nums, 0, nums.length - 1);
    }
    
    private TreeNode build (int[] nums, int si, int ei) {
	
	if ( si > ei ) return null;
	
	int mid = si + (ei - si) / 2;
	TreeNode node = new TreeNode(nums[mid]);
	node.left = build(nums, si, mid - 1);
	node.right = build(nums, mid + 1, ei);
	
	return node;
    }
    
    
}
