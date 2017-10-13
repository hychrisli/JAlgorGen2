package jalgor_gen2.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Q073Test_SetMatrixZeros {
	
	private Q073_SetMatrixZeros smz = new Q073_SetMatrixZeros();
	
	@Test
	public void test1(){
		int[][] input = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
		int[][] output = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
		this.smz.setZeroes(input);
		Assert.assertArrayEquals(input, output);
	}
}
