package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q611Test_ValidTriangleNum extends AbstractTest<Integer> {

	private Q611_ValidTriangleNum sol = new Q611_ValidTriangleNum();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1(){
		int[] input = {2,2,3,4};
		int output = 3;
		this.baseTest(output, sol.triangleNumber(input));
	}
	
	
	@Test
	public void test2(){
		int[] input = {2,2,3,4,5};
		int output = 6;
		this.baseTest(output, sol.triangleNumber(input));
	}
	
	
	@Test
	public void test3(){
		int[] input = {5,4,2,3,2};
		int output = 6;
		this.baseTest(output, sol.triangleNumber(input));
	}
}
