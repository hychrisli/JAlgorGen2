package jalgor_gen2.leetcode.part2;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import jalgor_gen2.leetcode.AbstractTest;

public class Q658Test_KClosestElem extends AbstractTest<List<Integer>>{

    Q658_KClosestElem sol = new Q658_KClosestElem();
    
    @Override
    protected void baseTest(List<Integer> expected, List<Integer> actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	int[] arr = {1,2,3,4,5};
	List<Integer> expected = Arrays.asList(new Integer[]{1,2,3,4});
	baseTest(expected, sol.findClosestElements(arr, 4, 3));
    }
    
    
    @Test
    public void test2() {
	int[] arr = {1,2,3,4,5};
	List<Integer> expected = Arrays.asList(new Integer[]{1,2,3,4});
	baseTest(expected, sol.findClosestElements(arr, 4, -1));
    }
    
    @Test
    public void test3() {
	int[] arr = {1,2,3,4,5};
	List<Integer> expected = Arrays.asList(new Integer[]{3,4,5});
	baseTest(expected, sol.findClosestElements(arr, 3, 7));
    }
    
    
    @Test
    public void test4() {
	int[] arr = {1,2,3,4,5,7};
	List<Integer> expected = Arrays.asList(new Integer[]{3,4,5,7});
	baseTest(expected, sol.findClosestElements(arr, 4, 6));
    }
    
    
    @Test
    public void test5() {
	int[] arr = {0,0,1,2,3,3,4,7,7,8};
	List<Integer> expected = Arrays.asList(new Integer[]{3,3,4});
	baseTest(expected, sol.findClosestElements(arr, 3, 5));
    }

    
}
