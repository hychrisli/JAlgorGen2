package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q670Test_MaxSwap extends AbstractTest<Integer> {

	private Q670_MaxSwap sol = new Q670_MaxSwap();
	
	@Override
	protected void baseTest(Integer expected, Integer actual) {
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1(){
		this.baseTest(7236, sol.maximumSwap(2736));
	}
	
	@Test
	public void test2(){
		this.baseTest(9973, sol.maximumSwap(9973));
	}
	
	@Test
	public void test3(){
		this.baseTest(98872, sol.maximumSwap(98278));
	}
	
}
