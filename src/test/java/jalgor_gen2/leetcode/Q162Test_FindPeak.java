package jalgor_gen2.leetcode;

import org.junit.Test;

public class Q162Test_FindPeak extends AbstractTest<Integer> {

	private Q162_FindPeak sol = new Q162_FindPeak();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		this.testAssertEquals(expected, actual);
	}

	@Test
	public void test1(){
		int[] input = {1, 2, 3, 1};
		this.baseTest(2, sol.findPeakElement(input));
	}
	
	
	@Test
	public void test2(){
		int[] input = {1, 2, 3, 4, 3, 2, 0};
		this.baseTest(3, sol.findPeakElement(input));
	}
	
	@Test
	public void test3(){
		int[] input = {1};
		this.baseTest(0, sol.findPeakElement(input));
	}
	
	
}
