package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

public class Q729Test_MyCalendarOne extends AbstractTest<Boolean> {
    
    @Override
    protected void baseTest(Boolean expected, Boolean actual) {
	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test1() {
	Q729_MyCalendarOne sol = new Q729_MyCalendarOne();
	
	baseTest(true, sol.book(10, 20));
	baseTest(false, sol.book(15, 25));
	baseTest(true, sol.book(20, 30));
	baseTest(true, sol.book(5, 10));
    }

}
