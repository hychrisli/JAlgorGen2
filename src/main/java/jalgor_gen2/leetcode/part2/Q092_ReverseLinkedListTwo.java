package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;
import jalgor_gen2.structure.ListNode;

public class Q092_ReverseLinkedListTwo extends Solution {
    
    
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
	ListNode h = new ListNode(0),fast = head, slow = h;
	h.next = head;
	
	for ( int i = 1; i < m; i++ ){
	    slow = fast;
	    fast = fast.next;
	}
	
	ListNode rh = new ListNode(0), rt;
	rh.next = fast;
	rt = rh.next;
	fast = fast.next;
	
	for ( int i = 1; i <= n - m; i++ ) {
	    ListNode tmp = fast.next;
	    fast.next = rh.next;
	    rh.next = fast;
	    fast = tmp;
	}
	rt.next = fast;    
	slow.next = rh.next;
	
	return h.next;
    }
}
