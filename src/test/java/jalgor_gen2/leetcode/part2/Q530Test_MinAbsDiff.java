package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q530Test_MinAbsDiff extends AbstractTest<Integer>{

    Q530_MinAbsDiff sol = new Q530_MinAbsDiff();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	String[] vals = {"2", "1", "3"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest( 1, sol.getMinimumDifference(root));
    }
    
    
    @Test
    public void test2() {
	String[] vals = {"1", "#", "3", "#", "#", "2"};
	TreeNode root = TreeNodeMapper.toTreeNode(vals);
	this.baseTest( 1, sol.getMinimumDifference(root));
    }
    
}
