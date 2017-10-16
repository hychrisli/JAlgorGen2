package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q031Test_NextPermutation extends AbstractTest<int[]> {

	private Q031_NextPermutation sol = new Q031_NextPermutation();

	@Override
	protected void baseTest(int[] expected, int[] actual) {
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void test1() {

		int[] input = { 1, 2, 3 };
		int[] output = { 1, 3, 2 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}

	@Test
	public void test2() {

		int[] input = { 1, 1, 2, 3, 4 };
		int[] output = { 1, 1, 2, 4, 3 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}

	@Test
	public void test3() {

		int[] input = { 1, 1, 4, 3, 2 };
		int[] output = { 1, 2, 1, 3, 4 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}

	@Test
	public void test4() {

		int[] input = { 4, 3, 2, 1, 1 };
		int[] output = { 1, 1, 2, 3, 4 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}

	@Test
	public void test5() {

		int[] input = { 1 };
		int[] output = { 1 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test6() {

		int[] input = { 1, 3, 2 };
		int[] output = { 2, 1, 3 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test7() {

		int[] input = { 1, 3};
		int[] output = { 3, 1 };
		sol.nextPermutation(input);
		this.baseTest(output, input);
	}

}
