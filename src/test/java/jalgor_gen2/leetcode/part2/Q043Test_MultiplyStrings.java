package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q043Test_MultiplyStrings extends AbstractTest<String> {

    Q043_MultiplyStrings sol = new Q043_MultiplyStrings();
    
    @Override
    protected void baseTest(String expected, String actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	baseTest("891", sol.multiply("9", "99"));
    }
    
    @Test
    public void test2() {
	baseTest("1000", sol.multiply("10", "100"));
    }
    
    @Test
    public void test3() {
	baseTest("0", sol.multiply("933", "0"));
    }
    
    
}
