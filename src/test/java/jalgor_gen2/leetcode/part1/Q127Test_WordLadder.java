package jalgor_gen2.leetcode.part1;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q127Test_WordLadder extends AbstractTest<Integer> {

    Q127_WordLadder sol = new Q127_WordLadder();
    
    
    @Override
    protected void baseTest(Integer expected, Integer actual) {
	Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void test1(){
	
	String[] wordArray = {"hot", "dot", "dog", "lot", "log", "cog"};
	List<String> wordList = Arrays.asList(wordArray);
	baseTest(5, sol.ladderLength("hit", "cog", wordList));
	
    }
    
    
}
