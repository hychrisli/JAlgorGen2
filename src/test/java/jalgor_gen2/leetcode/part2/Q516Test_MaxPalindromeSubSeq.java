package jalgor_gen2.leetcode.part2;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;


public class Q516Test_MaxPalindromeSubSeq extends AbstractTest<Integer>{

    Q516_MaxPalindromeSubSeq sol = new Q516_MaxPalindromeSubSeq();
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }

    @Test
    public void test1 () {
	baseTest(4, sol.longestPalindromeSubseq("bbbab"));
    }
    
    @Test
    public void test2 () {
	baseTest(2, sol.longestPalindromeSubseq("cbbd"));
    }
    
    @Test
    public void test3 () {
	baseTest(29, sol.longestPalindromeSubseq("asdfasdonsannwaenlasndosndnalnklnoiasndfassdgijnknlasdogugkasdf"));
    }
    
    @Test
    public void test4 () {
	baseTest(1, sol.longestPalindromeSubseq("b"));
    }
    
    @Test
    public void test5 () {
	baseTest(1, sol.longestPalindromeSubseq("ab"));
    }
    
}
