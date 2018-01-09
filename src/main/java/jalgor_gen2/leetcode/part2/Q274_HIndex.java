package jalgor_gen2.leetcode.part2;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

public class Q274_HIndex extends Solution{
    
    public int hIndex(int[] citations) {
	int len = citations.length;
	int[] cnt = new int[len+1];
	
	for ( int c : citations ) {
	    if ( c > len ){
		cnt[len] ++;
	    } else {
		cnt[c] ++;
	    }
	}
	
	int total = 0;
	for ( int i = len; i >= 0; i -- ) {
	    
	    total += cnt[i];
	    if ( total >= i )
		return i;
	}
	
	return 0;
    }
    
}
