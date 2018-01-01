package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;


public class Q718Test_CommonSubArrayMaxLen extends AbstractTest<Integer>{

    Q718_CommonSubArrayMaxLen sol = new Q718_CommonSubArrayMaxLen();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test1 () {
	baseTest(3, sol.findLength(new int[]{1,2,3,2,1}, new int[]{3,2,1,4,7}));
    }
    
    @Test
    public void test2 () {
	int[] A = {1,2,3,2,1,2,2,3,4,5,7,2,4,2,3,4,6};
	int[] B= {3,2,1,4,7,4,3,1,2,3,5,2,3,2,1};
	baseTest(4, sol.findLength(A, B));
    }

}
