package jalgor_gen2.structure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
	val = x;
    }
    
    public String toString() {
	
	StringBuilder sb = new StringBuilder();
	ListNode cur = this;
	
	while ( cur != null ) {
	    sb.append( cur.val + ", ");
	    cur = cur.next;
	}
	
	return sb.toString();
    }
}
