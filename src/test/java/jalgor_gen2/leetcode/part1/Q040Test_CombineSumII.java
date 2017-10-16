package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.leetcode.part1.Q040_CombineSumII;

public class Q040Test_CombineSumII extends AbstractTest<List<List<Integer>>> {

	private Q040_CombineSumII sol = new Q040_CombineSumII();
	
	@Override
	protected void baseTest(List<List<Integer>> expected, List<List<Integer>> actual) {
		Assert.assertEquals(expected.size(), actual.size());
		this.testSetEqualTo(new HashSet<List<Integer>>(expected), 
				new HashSet<List<Integer>>(actual));
	}

	@Test
	public void test1(){
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		output.add(Arrays.asList(new Integer[]{1,7}));
		output.add(Arrays.asList(new Integer[]{1, 2, 5}));
		output.add(Arrays.asList(new Integer[]{2, 6}));
		output.add(Arrays.asList(new Integer[]{1, 1, 6}));
		
		this.baseTest(output, sol.combinationSum2(candidates, 8));
	}
	
	@Test
	public void test2(){
		int[] candidates = {3,1,3,5,1,1};
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		output.add(Arrays.asList(new Integer[]{1, 1, 1, 5}));
		output.add(Arrays.asList(new Integer[]{1,1,3,3}));
		output.add(Arrays.asList(new Integer[]{3,5}));
		
		this.baseTest(output, sol.combinationSum2(candidates, 8));
	}
	
	
}
