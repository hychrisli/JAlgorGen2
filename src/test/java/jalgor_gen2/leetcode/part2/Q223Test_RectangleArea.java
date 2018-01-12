package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q223Test_RectangleArea extends AbstractTest<Integer>{

    Q223_RectangleArea sol = new Q223_RectangleArea();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	baseTest(16, sol.computeArea(-2, -2, 2, 2, -2, -2, 2, 2));
    }
    
    @Test
    public void test2() {
	baseTest(45, sol.computeArea(-3,0,3,4,0,-1,9,2));
    }
    
    @Test
    public void test3() {
	baseTest(36, sol.computeArea(-2, -2, 2, 2, -3, -3, 3, 3));
    }
    
    
    @Test
    public void test4() {
	baseTest(13, sol.computeArea(-2, -2, 0, 0, 0, 0, 3, 3));
    }
    
    @Test
    public void test5() {
	baseTest(2, sol.computeArea(-1500000001,0,-1500000000,1,1500000000,0,1500000001,1));
    }
    
    
}
