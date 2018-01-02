package jalgor_gen2.leetcode.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import jalgor_gen2.leetcode.AbstractTest;

public class Q046Test_Permutation extends AbstractTest<List<List<Integer>>> {

    @Override
    protected void baseTest(List<List<Integer>> expected, List<List<Integer>> actual) {
	Assert.assertEquals(toStringSet(expected), toStringSet(actual));
    }

    private Set<String> toStringSet(List<List<Integer>> input) {
	
	Set<String> res = new HashSet<String>();
	
	for ( List<Integer> lst : input) 
	    res.add(Arrays.toString(lst.toArray()));
	
	return res;
    }
    
    @Test
    public void test1() {
	
    }
    
    
}
