package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q098Test_ValidBst extends AbstractTest<Boolean> {

    private Q098_ValidBst sol = new Q098_ValidBst();

    @Override
    protected void baseTest(Boolean expected, Boolean actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	String[] vals = {"2", "1", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(true, sol.isValidBST(root));
    }

    @Test
    public void test2() {
	String[] vals = {"1", "2", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(false, sol.isValidBST(root));
    }
    
    
    @Test
    public void test3() {
	String[] vals = {"1", "#", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(true, sol.isValidBST(root));
    }
    
    @Test
    public void test4() {
	String[] vals = {"4"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest(true, sol.isValidBST(root));
    }
    
    
}
