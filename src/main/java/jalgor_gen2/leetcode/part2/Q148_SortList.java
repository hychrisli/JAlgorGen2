package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.ListNode;

public class Q148_SortList {
    public ListNode sortList(ListNode head) {
        
	if ( head == null || head.next == null) return head;
	
	ListNode slow = new ListNode(0), fast = head;
	slow.next = head;
	// System.out.println("input: " + head.toString());

	while ( fast != null && fast.next != null) {
	    slow = slow.next;
	    fast = fast.next.next;
	}
	
	ListNode right = sortList(slow.next);
	slow.next = null;
	ListNode left = sortList(head);
	
	return merge(left, right);
    }
    
    public ListNode merge(ListNode l1, ListNode l2) {
	
	ListNode head = new ListNode(0), cur = head;
	while ( l1 != null && l2 != null) {
	    
	    if ( l1.val < l2.val) {
		cur.next = l1;
		cur = l1;
		l1 = l1.next;
	    } else {
		cur.next = l2;
		cur = l2;
		l2 = l2.next;
	    }
	}

	if ( l1 != null )
	    cur.next = l1;
	
	if ( l2 != null)
	    cur.next = l2;
	
	return head.next;
    }
    
}
