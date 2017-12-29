package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q460Test_LFUCache extends AbstractTest<Integer>{

    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test1 (){
	Q460_LFUCache sol = new Q460_LFUCache(2);
	sol.put(1, 1);
	sol.put(2, 2);
	baseTest(1, sol.get(1));
	sol.put(3, 3);
	baseTest(-1, sol.get(2));
	baseTest(3, sol.get(3));
	sol.put(4, 4);
	baseTest(-1, sol.get(1));
	baseTest(3, sol.get(3));
	baseTest(4, sol.get(4));
    }
    
    
    @Test
    public void test2 (){
	Q460_LFUCache sol = new Q460_LFUCache(2);
	sol.put(1, 1);
	sol.put(2, 2);
	baseTest(1, sol.get(1));
	baseTest(1, sol.get(1));
	baseTest(1, sol.get(1));
	sol.put(2, 2);
	sol.put(3, 3);
	baseTest(-1, sol.get(2));
	baseTest(3, sol.get(3));
	baseTest(3, sol.get(3));
	sol.put(4, 4);
	baseTest(1, sol.get(1));
	baseTest(-1, sol.get(3));
	baseTest(4, sol.get(4));
    }
    
    
    @Test
    public void test3 (){
	Q460_LFUCache sol = new Q460_LFUCache(0);
	sol.put(0, 0);
	baseTest(-1, sol.get(0));
    }

    @Test
    public void test4 (){
	Q460_LFUCache sol = new Q460_LFUCache(10);
	sol.put(10, 13);
	sol.put(3, 17);
	sol.put(6, 11);
	sol.put(10, 5);
	sol.put(9, 10);
	baseTest(-1, sol.get(13));
	sol.put(2, 19);
    }
    
    
}
