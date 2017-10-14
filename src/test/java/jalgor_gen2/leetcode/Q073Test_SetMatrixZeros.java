package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q073Test_SetMatrixZeros extends AbstractTest<int[][]> {

	private Q073_SetMatrixZeros smz = new Q073_SetMatrixZeros();

	@Override
	protected void baseTest(int[][] expecteds, int[][] actuals) {
		Assert.assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void test1() {
		int[][] input = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int[][] output = { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };
		this.smz.setZeroes(input);
		this.baseTest(input, output);
	}

	@Test
	public void test2() {
		int[][] input = { { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		int[][] output = { { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 0, 1, 1 }, { 1, 0, 1, 1 } };
		this.smz.setZeroes(input);
		this.baseTest(input, output);
	}

	@Test
	public void test3() {
		int[][] input = { { 1 } };
		int[][] output = { { 1 } };
		this.smz.setZeroes(input);
		this.baseTest(input, output);
	}

	@Test
	public void test4() {
		int[][] input = { { 1, 0 }, { 0, 1 } };
		int[][] output = { { 0, 0 }, { 0, 0 } };
		this.smz.setZeroes(input);
		this.baseTest(input, output);
	}
	
	@Test
	public void test5() {
		int[][] input = { { 1, 0 }};
		int[][] output = { { 0, 0 } };
		this.smz.setZeroes(input);
		this.baseTest(input, output);
	}

	
	@Test
	public void test6() {
		int[][] input = {{1,1,1},{0,1,2}};
		int[][] output = {{0,1,1},{0,0,0}};
		this.smz.setZeroes(input);
		this.baseTest(input, output);
	}

	
	

}
