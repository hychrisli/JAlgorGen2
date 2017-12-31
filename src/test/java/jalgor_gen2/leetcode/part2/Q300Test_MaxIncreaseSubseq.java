package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q300Test_MaxIncreaseSubseq extends AbstractTest<Integer>{

    Q300_MaxIncreaseSubseq sol = new Q300_MaxIncreaseSubseq();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	int[] nums = {3,5,6,2,5,4,19,5,6,7,12};
	baseTest( 6, sol.lengthOfLIS(nums));
    }
    
    
}
