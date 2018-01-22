package jalgor_gen2.leetcode.part3;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q284Test_PeekingInterator extends AbstractTest<Integer>{

    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
	
    }
    
    @Test
    public void test1() {
	Integer[] a = {1,2,3};
	List<Integer> list = Arrays.asList(a);
	Q284_PeekingIterator sol = new Q284_PeekingIterator(list.iterator());
	
	baseTest(1, sol.peek());
	baseTest(1, sol.next());
	baseTest(2, sol.peek());
	baseTest(2, sol.peek());
	baseTest(2, sol.next());
	baseTest(3, sol.next());
	//sol.peek();
    }

}
