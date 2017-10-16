package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.mapper.TreeNodeMapper;
import jalgor_gen2.structure.TreeNode;

public class Q515Test_TreeRowMaxVal extends AbstractTest<List<Integer>> {
	
	private Q515_TreeRowMaxVal sol = new Q515_TreeRowMaxVal();
	
	@Override
	protected void baseTest(List<Integer> expected, List<Integer> actual) {
		this.testAssertEquals(expected, actual);
	}
	
	@Test
	public void test1(){
		String[] vals = {"1", "3", "2", "5", "3", "#", "9"};
		TreeNode tree = TreeNodeMapper.toTreeNode(vals);
		List<Integer> output = Arrays.asList(new Integer[]{1, 3, 5});
		
		this.baseTest(output, sol.largestValues(tree));
	}

}
