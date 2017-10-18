package jalgor_gen2.leetcode.part1;

import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q513Test_TreeBottomLeft extends AbstractTest<Integer> {

	private Q513_TreeBottomLeft sol = new Q513_TreeBottomLeft();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		this.testAssertEquals(expected, actual);
	}
	
	@Test
	public void test1(){
		String[] vals = {"2", "1", "3"};
		TreeNode tree = TreeNodeMapper.toTreeNode(vals);
		this.baseTest(1, sol.findBottomLeftValue(tree));
	}

	@Test
	public void test2(){
		String[] vals = {"1", "2", "3", "4", "#", "5", "6", "#", "#", "#", "#", "7"};
		TreeNode tree = TreeNodeMapper.toTreeNode(vals);
		this.baseTest(7, sol.findBottomLeftValue(tree));
	}

	
}
