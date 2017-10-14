package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q667Test_BeautifulArrangeII extends AbstractTest<int[]> {

	private Q667_BeautifulArrangeII sol = new Q667_BeautifulArrangeII();
	
	@Override
	protected void baseTest(int[] expected, int[] actual) {
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void test1(){
		int[] output = {1, 2, 3};
		this.baseTest(output, sol.constructArray(3, 1));
	}
	
	
	@Test
	public void test2(){
		int[] output = {3, 1, 2};
		this.baseTest(output, sol.constructArray(3, 2));
	}
	
	
	@Test
	public void test3(){
		int[] output = {5, 1, 2, 3, 4};
		this.baseTest(output, sol.constructArray(5, 2));
	}
	
	
	@Test
	public void test4(){
		int[] output = {1, 5, 2, 3, 4};
		this.baseTest(output, sol.constructArray(5, 3));
	}
	
}
