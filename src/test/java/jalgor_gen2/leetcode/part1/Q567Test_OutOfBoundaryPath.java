package jalgor_gen2.leetcode.part1;

import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q567Test_OutOfBoundaryPath extends AbstractTest<Integer> {

	private Q567_OutOfBoundaryPath sol = new Q567_OutOfBoundaryPath();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		this.testAssertEquals(expected, actual);
	}
	
	@Test
	public void test1(){
		this.baseTest(6, sol.findPaths(2, 2, 2, 0, 0));
	}
	
	@Test
	public void test2(){
		this.baseTest(12, sol.findPaths(1, 3, 3, 0, 1));
	}

	@Test
	public void test3(){
		this.baseTest(32, sol.findPaths(2, 3, 4, 0, 0));
	}
	
	@Test
	public void test4(){
		this.baseTest(171, sol.findPaths(4, 3, 5, 1, 1));
	}
	
	@Test
	public void test5(){
		this.baseTest(914783380, sol.findPaths(8, 50, 23, 5, 26));
	}
	

}
