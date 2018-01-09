package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.ListNodeMapper;
import jalgor_gen2.structure.ListNode;

public class Q148Test_SortList extends AbstractTest<ListNode> {

    Q148_SortList sol = new Q148_SortList();
    
    @Override
    protected void baseTest(ListNode expected, ListNode actual) {
	Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void test1() {
	ListNode input = ListNodeMapper.toListNode(new int[]{1, 2, 5, 3, 4, 7});
	ListNode expected = ListNodeMapper.toListNode(new int[]{1, 2, 3, 4, 5, 7});
	
	baseTest(expected, sol.sortList(input));
    }
    
}
