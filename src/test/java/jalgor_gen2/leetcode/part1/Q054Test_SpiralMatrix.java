package jalgor_gen2.leetcode.part1;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.leetcode.part1.Q054_SpiralMatrix;

public class Q054Test_SpiralMatrix extends AbstractTest<List<Integer>> {

	private Q054_SpiralMatrix sol = new Q054_SpiralMatrix();
	
	@Override
	protected void baseTest(List<Integer> expected, List<Integer> actual) {
		Assert.assertThat(actual, equalTo(expected));
	}

	@Test
	public void test1(){
		int[][] matrix = {{1,2,3},{4, 5, 6}, {7,8,9}};
		List<Integer> output = Arrays.asList(new Integer[]{1,2,3,6,9,8,7,4,5});
		this.baseTest(output, sol.spiralOrder(matrix));
	}
	
}
