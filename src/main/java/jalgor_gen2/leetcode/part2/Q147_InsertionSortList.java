package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.ListNode;

public class Q147_InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        
	if ( head == null ) return null;
	
	ListNode hd = new ListNode(0);
	hd.next = head;
	ListNode pre = head, cur = head.next;
	
	while ( cur != null ) {
	    
	    if ( cur.val >= pre.val) {
		pre = cur;
		cur = cur.next;
		continue;
	    }
	    
	    ListNode node = cur, pnt = hd;
	    cur = cur.next;
	    pre.next = cur;
	    
	    while ( pnt.next.val < node.val) pnt = pnt.next;
	    
	    node.next = pnt.next;
	    pnt.next = node;
	}
	
	return hd.next;
    }
    
}
