package jalgor_gen2.leetcode.part1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jalgor_gen2.leetcode.Solution;

public class Q567_OutOfBoundaryPath extends Solution {
    public int findPaths(int m, int n, int N, int i, int j) {
    	
    	Map<String, Long> lkp = new HashMap<String, Long>();
    	return (int) (helper(m, n, N, i, j, lkp) % ((int) Math.pow(10, 9) + 7));
    }
    
    private long helper(int m, int n, int N, int i, int j, Map<String, Long> lkp){
    	long wayout = 0;
    	if ( N == 0 ) return wayout;
    	String key = Arrays.toString(new int[]{N, i, j});
    	if ( lkp.containsKey(key))
    		return lkp.get(key);
    	
    	if ( i == 0) wayout ++;
    	if ( i == m - 1) wayout ++;
    	if ( j == 0) wayout ++;
    	if ( j == n - 1) wayout ++;
    	
    	if ( i > 0 ) wayout += helper(m, n, N-1, i-1, j, lkp);
    	if ( i < m - 1)	wayout += helper(m, n, N-1, i+1, j, lkp);
    	if ( j > 0) wayout += helper(m, n, N-1, i, j-1, lkp);
    	if ( j < n -1) wayout += helper(m, n, N-1, i, j+1, lkp);
    	
    	lkp.put(key, wayout);
    	return wayout;
    }
}
