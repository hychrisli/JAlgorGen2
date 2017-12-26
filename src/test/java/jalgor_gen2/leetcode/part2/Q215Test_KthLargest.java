package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q215Test_KthLargest extends AbstractTest<Integer> {

    Q215_KthLargest sol = new Q215_KthLargest();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	int[] nums = new int[] {-10, -2, -30, 2, 15, 26};
	baseTest(15, sol.findKthLargest(nums, 2));
	baseTest(15, sol.findKthLargestPQ(nums, 2));
    }
    
    
    @Test
    public void test2() {
	int[] nums = new int[] {3,2,1,5,6,4};
	baseTest(5, sol.findKthLargest(nums, 2));
	baseTest(5, sol.findKthLargestPQ(nums, 2));
    }
    
    
}
