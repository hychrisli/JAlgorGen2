package jalgor_gen2.leetcode.part2;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q347Test_TopKFreqElem extends AbstractTest<List<Integer>>{

    Q347_TopKFreqElem sol = new Q347_TopKFreqElem();
    
    @Override
    protected void baseTest(List<Integer> expected, List<Integer> actual) {
	Assert.assertEquals(Arrays.toString(expected.toArray()), 
		Arrays.toString(actual.toArray()));
    }

    @Test
    public void test1() {
	int[] nums = new int[] {1,1,1,2,2,3};
	Integer[] expected = new Integer[] {1, 2};
	this.baseTest(Arrays.asList(expected), sol.topKFrequent(nums, 2));
    }
    
    
    @Test
    public void test2() {
	int[] nums = new int[] {4,5,3,2,2,3,2,1,4,5,6,3,2,1,1,2,3};
	Integer[] expected = new Integer[] {2, 3, 1, 4};
	this.baseTest(Arrays.asList(expected), sol.topKFrequent(nums, 4));
    }
}
