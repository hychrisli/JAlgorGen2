package jalgor_gen2.leetcode.part2;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;


public class Q093Test_RestoreIPAddress extends AbstractTest<String>{

    Q093_RestoreIPAddresses sol = new Q093_RestoreIPAddresses();
    
    @Override
    protected void baseTest(String expected, String actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	List<String> res = sol.restoreIpAddresses("010010");
	System.out.println(Arrays.toString(res.toArray()));
    }
    
}
