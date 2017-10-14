package jalgor_gen2.leetcode;

import java.util.Arrays;

public class Q621_TaskScheduler extends Solution {
    public int leastInterval(char[] tasks, int n) {
    	int[] lkp = new int[26];

    	for ( int i = 0; i < tasks.length; i ++)
    		lkp[tasks[i] - 'A'] += 1;
    		
    	Arrays.sort(lkp);
    	int k = 25;
    	while ( k > 0 && lkp[k] == lkp[25]) k--;
    
    	return Math.max(tasks.length, (n + 1) * (lkp[25] - 1) + 25 - k);
    }
}
