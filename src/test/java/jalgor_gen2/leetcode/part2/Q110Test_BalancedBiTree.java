package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q110Test_BalancedBiTree extends AbstractTest<Boolean>{

    Q110_BalancedBiTree sol = new Q110_BalancedBiTree();
    
    @Override
    protected void baseTest(Boolean expected, Boolean actual) {
	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test1() {
	String[] vals = {"2", "1", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(true, sol.isBalanced(root));
    }
    
    
    @Test
    public void test2() {
	String[] vals = {"2", "#", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(true, sol.isBalanced(root));
    }
    
    @Test
    public void test3() {
	String[] vals = {"2", "1", "#", "4"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(false, sol.isBalanced(root));
    }

    @Test
    public void test4() {
	String[] vals = {"1", "#", "2", "#", "#", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(false, sol.isBalanced(root));
    }
    
    
    @Test
    public void test5() {
	String[] vals = {"1","2","2","3","3","3","3","4","4","4","4","4","4","#","#","5","5"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(true, sol.isBalanced(root));
    }
    
}
