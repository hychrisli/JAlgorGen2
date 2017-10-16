package jalgor_gen2.leetcode.part1;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.leetcode.part1.Q033_RotatedSearch;

public class Q033Test_RotatedSearch extends AbstractTest<Integer> {

	private Q033_RotatedSearch sol = new Q033_RotatedSearch();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test1(){
		int[] input = {4,5,6,7,0,1,2};
		this.baseTest(2, sol.search(input, 6));
	}

	@Test
	public void test2(){
		int[] input = {4,5,6,7,0,1,2};
		this.baseTest(-1, sol.search(input, 8));
	}

	@Test
	public void test3(){
		int[] input = {4,5,0,1,2};
		this.baseTest(3, sol.search(input, 1));
	}
	
	
	@Test
	public void test4(){
		int[] input = {3, 1};
		this.baseTest(1, sol.search(input, 1));
	}
	
	@Test
	public void test5(){
		int[] input = {3, 1, 2};
		this.baseTest(2, sol.search(input, 2));
	}
	
	
	@Test
	public void test6(){
		int[] input = {3, 1, 2};
		this.baseTest(0, sol.search(input, 3));
	}
	
	
	@Test
	public void test7(){
		int[] input = {3, 1, 2};
		this.baseTest(-1, sol.search(input, 4));
	}
	
	
	@Test
	public void test8(){
		int[] input = {1};
		this.baseTest(-1, sol.search(input, 4));
	}
	
	
}
