package jalgor_gen2.leetcode.part1;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;
import jalgor_gen2.leetcode.part1.Q055_JumpGame;

public class Q055Test_JumpGame extends AbstractTest<Boolean> {

	private Q055_JumpGame sol = new Q055_JumpGame();
	
	@Override
	protected void baseTest(Boolean expected, Boolean actual) {
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void test1 (){
		int[] input = {2,3,1,1,4};
		this.baseTest(true, sol.canJump(input));
	}
	
	
	@Test
	public void test2 (){
		int[] input = {3,2,1,0,4};
		this.baseTest(false, sol.canJump(input));
	}
	
	
	@Test
	public void test3 (){
		int[] input = {1, 1, 1, 0, 1};
		this.baseTest(false, sol.canJump(input));
	}
	
	@Test
	public void test4 (){
		int[] input = {10, 1, 1, 0, 1};
		this.baseTest(true, sol.canJump(input));
	}
	

}
