package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;


public class Q166Test_RecurDecimal extends AbstractTest<String> {

    Q166_RecurDecimal sol = new Q166_RecurDecimal();
    
    @Override
    protected void baseTest(String expected, String actual) {
	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test1() {
	baseTest("2.(857142)", sol.fractionToDecimal(20, 7));
    }
    
    @Test
    public void test2() {
	baseTest("0.(327868852459016393442622950819672131147540983606557377049180)", sol.fractionToDecimal(20, 61));
    }
    
    @Test
    public void test3() {
	baseTest("-1.(193548387096774)", sol.fractionToDecimal(-37, 31));
    }

    @Test
    public void test4() {
	baseTest("-1.(193548387096774)", sol.fractionToDecimal(37, -31));
    }

    @Test
    public void test5() {
	baseTest("-37", sol.fractionToDecimal(-37, 1));
    }
    
    @Test
    public void test6() {
	baseTest("-2.3125", sol.fractionToDecimal(-37, 16));
    }
    
    @Test
    public void test7() {
	baseTest("0.1(6)", sol.fractionToDecimal(1, 6));
    }
    
    @Test
    public void test8() {
	baseTest("0", sol.fractionToDecimal(0, 3));
    }
    
    
}
