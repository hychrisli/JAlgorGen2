package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.ListNodeMapper;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.ListNode;
import jalgor_gen2.structure.TreeNode;

public class Q109Test_SortedList2Bst extends AbstractTest<TreeNode> {

    Q109_SortedList2Bst sol = new Q109_SortedList2Bst();
    
    @Override
    protected void baseTest(TreeNode expected, TreeNode actual) {
	Assert.assertEquals(expected.toString(), actual.toString());
    }

    private void test(int[] lstNums, String[] treeVals) {
	ListNode head = ListNodeMapper.toListNode(lstNums);
	TreeNode root = TreeNodeMapper.toTreeNode(treeVals);
	baseTest(root, sol.sortedListToBST(head));
    }
    
    @Test
    public void test1() {
	test(new int[]{1}, new String[]{"1"});
    }
    
    @Test
    public void test2() {
	int[] lstNums = {1, 2};
	String[] treeVals = {"2", "1"};
	test(lstNums,treeVals);
    }
    
    @Test
    public void test3() {
	int[] lstNums = {1, 2, 3};
	String[] treeVals = {"2", "1", "3"};
	test(lstNums,treeVals);
    }
    
    @Test
    public void test4() {
	int[] lstNums = {1, 2, 3, 4};
	String[] treeVals = {"3", "2", "4", "1"};
	test(lstNums,treeVals);
    }
    
    @Test
    public void test5() {
	int[] lstNums = {1, 2, 3, 4, 5};
	String[] treeVals = {"3", "2", "5", "1", "#", "4"};
	test(lstNums,treeVals);
    }
    
    @Test
    public void test6() {
	int[] lstNums = {1, 2, 3, 4, 5, 6};
	String[] treeVals = {"4", "2", "6", "1", "3", "5"};
	test(lstNums,treeVals);
    }
    
    @Test
    public void test7() {
	int[] lstNums = {1, 2, 3, 4, 5, 6, 7};
	String[] treeVals = {"4", "2", "6", "1", "3", "5", "7"};
	test(lstNums,treeVals);
    }
    
    @Test
    public void test8() {
	int[] lstNums = {1, 2, 3, 4, 5, 6, 7, 8};
	String[] treeVals = {"5", "3", "7", "2", "4", "6", "8", "1"};
	test(lstNums,treeVals);
    }
    
}
