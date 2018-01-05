package jalgor_gen2.leetcode.part2;

import jalgor_gen2.structure.ListNode;

public class Q143_ReorderList {

    public void reorderList(ListNode head) {

	if (head == null)
	    return;

	// find mid point
	ListNode slow = head, fast = head;
	while (fast.next != null && fast.next.next != null) {
	    fast = fast.next.next;
	    slow = slow.next;
	}

	// reverse linked list
	ListNode hd = slow;
	ListNode cur = slow.next;
	if (cur != null) {
	    ListNode last = cur;
	    cur = cur.next;
	    last.next = null;
	}

	while (cur != null) {
	    ListNode tmp = cur.next;
	    cur.next = hd.next;
	    hd.next = cur;
	    cur = tmp;
	}

	// merge two lists
	ListNode a = head, b = hd.next;
	hd.next = null;

	while (a != null && b != null) {
	    ListNode nextA = a.next;
	    ListNode nextB = b.next;
	    a.next = b;
	    a = nextA;
	    b.next = a;
	    b = nextB;
	}
    }
}
