package jalgor_gen2.leetcode.part1;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.leetcode.part1.Q048_RotateImage;

public class Q048Test_RotateImage extends AbstractTest<int[][]> {

	private Q048_RotateImage sol = new Q048_RotateImage();
	
	
	@Override
	protected void baseTest(int[][] expected, int[][] actual) {
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void test1(){
		int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] output = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		sol.rotate(input);
		this.baseTest(output, input);
	}
	
	
	@Test
	public void test2(){
		int[][] input = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
		int[][] output = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
		sol.rotate(input);
		this.baseTest(output, input);
	}

}
