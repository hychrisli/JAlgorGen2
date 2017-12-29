package jalgor_gen2.mapper;

import jalgor_gen2.structure.ListNode;

public class ListNodeMapper {

    public static ListNode toListNode(int[] nums) {
	
	ListNode head = new ListNode(0), curNode = head;
	
	for ( int i = 0; i < nums.length; i++ ) {
	    curNode.next = new ListNode(nums[i]);
	    curNode = curNode.next;
	}
	return head.next;
    }
}
