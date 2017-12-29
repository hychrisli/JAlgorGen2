package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q680Test_ValidPalindromeTwo extends AbstractTest<Boolean> {

    Q680_ValidPalindromeTwo sol = new Q680_ValidPalindromeTwo();

    @Override
    protected void baseTest(Boolean expected, Boolean actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1() {
	baseTest(true, sol.validPalindrome("aba"));
    }

    @Test
    public void test2() {
	baseTest(true, sol.validPalindrome("abca"));
    }

    @Test
    public void test3() {
	baseTest(false, sol.validPalindrome("abcda"));
    }

    @Test
    public void test4() {
	baseTest(true, sol.validPalindrome(
		"aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

}
