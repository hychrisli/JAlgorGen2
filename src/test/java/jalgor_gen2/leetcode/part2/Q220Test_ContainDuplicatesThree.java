package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q220Test_ContainDuplicatesThree extends AbstractTest<Boolean> {

    Q220_ContainDuplicateThree sol = new Q220_ContainDuplicateThree();
    
    @Override
    protected void baseTest(Boolean expected, Boolean actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	int[] ary = new int[] {-10, -2, -30, 2, 15, 26};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 2, 3));
    }
    
    @Test
    public void test2() {
	int[] ary = new int[] {-10, -2, -30, 14, 5, 26};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 1, 2));
    }
    
    @Test
    public void test3() {
	int[] ary = new int[] {-1, -1};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 1, -1));
    }
    
    
    @Test
    public void test4() {
	int[] ary = new int[] {-1, -1};
	this.baseTest(true, sol.containsNearbyAlmostDuplicate(ary, 1, 0));
    }
    
    
    @Test
    public void test5() {
	int[] ary = new int[] {4, 2};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 2, 1));
    }
    
    @Test
    public void test6() {
	int[] ary = new int[] {1, 2};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 0, 1));
    }
    
    
    @Test
    public void test7() {
	int[] ary = new int[] {3, 6, 0, 2};
	this.baseTest(true, sol.containsNearbyAlmostDuplicate(ary, 2, 2));
    }
 
    @Test
    public void test8() {
	int[] ary = new int[] {3, 6, -1, 1};
	this.baseTest(true, sol.containsNearbyAlmostDuplicate(ary, 2, 2));
    }
    
    
    @Test
    public void test9() {
	int[] ary = new int[] {-1,2147483647};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 1, 2147483647));
    }
    
    @Test
    public void test10() {
	int[] ary = new int[] {0,-2147483648};
	this.baseTest(false, sol.containsNearbyAlmostDuplicate(ary, 1, 2147483647));
    }
    
    @Test
    public void test11() {
	int[] ary = new int[] {-1,-2147483648};
	this.baseTest(true, sol.containsNearbyAlmostDuplicate(ary, 1, 2147483647));
    } 
}
