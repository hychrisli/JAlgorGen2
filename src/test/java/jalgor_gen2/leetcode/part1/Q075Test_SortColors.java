package jalgor_gen2.leetcode.part1;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.leetcode.part1.Q075_SortColors;

public class Q075Test_SortColors extends AbstractTest<int[]> {

	private Q075_SortColors sol = new Q075_SortColors();
	
	@Override
	protected void baseTest(int[] expecteds, int[] actuals) {
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void test1(){
		int[] input = {1,2,0,1,2,1,1,0,1,2};
		int[] output = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2};
		sol.sortColors(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test2(){
		int[] input = {1, 1, 1, 1, 1, 1, 1};
		int[] output = {1, 1, 1, 1, 1, 1, 1};
		sol.sortColors(input);
		this.baseTest(output, input);
	}

	@Test
	public void test3(){
		int[] input = {0,0,0,0,0,0,0,0,0};
		int[] output = {0,0,0,0,0,0,0,0,0};
		sol.sortColors(input);
		this.baseTest(output, input);
	}
	
	@Test
	public void test4(){
		int[] input = {2,2,2,2};
		int[] output = {2,2,2,2};
		sol.sortColors(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test5(){
		int[] input = {0, 0, 0, 1, 1, 1, 2, 2, 2};
		int[] output = {0, 0, 0, 1, 1, 1, 2, 2, 2};
		sol.sortColors(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test6(){
		int[] input = {0, 0, 0, 2, 2};
		int[] output = {0, 0, 0, 2, 2};
		sol.sortColors(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test7(){
		int[] input = {0,2,2,2,0,2,1,1};
		int[] output = {0,0,1,1,2,2,2,2};
		sol.sortColors(input);
		this.baseTest(output, input);
	}
	
}
