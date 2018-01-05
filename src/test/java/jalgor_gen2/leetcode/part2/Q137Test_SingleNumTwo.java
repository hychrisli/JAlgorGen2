package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q137Test_SingleNumTwo extends AbstractTest<Integer>{

    Q137_SingleNumTwo sol = new Q137_SingleNumTwo();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }
    
    
    @Test
    public void test1(){
	baseTest(1, sol.singleNumber(new int[]{2,3,2,3,1,2,3}));
	
    }

}
