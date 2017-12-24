package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q050Test_PowXn extends AbstractTest<Double>{

    Q050_PowXn sol = new Q050_PowXn();
    
    @Override
    protected void baseTest(Double expected, Double actual) {
	Assert.assertEquals(String.format("%.5f", expected), String.format("%.5f", actual));
    }

    @Test
    public void test1() {
	baseTest(1024.0, sol.myPow(2.0, 10));
    }
    
    
    @Test
    public void test2() {
	baseTest(9.261, sol.myPow(2.1, 3));
    }
    
    
    @Test
    public void test3() {
	baseTest(0.00003, sol.myPow(34.00515, -3));
    }
    
    @Test
    public void test4() {
	baseTest(0.00000, sol.myPow(2.00000,-2147483648));
    }
    
}
