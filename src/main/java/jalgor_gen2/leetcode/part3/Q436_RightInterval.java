package jalgor_gen2.leetcode.part3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jalgor_gen2.structure.Interval;

public class Q436_RightInterval {

    public int[] findRightInterval(Interval[] intervals) {
        
	int n = intervals.length;
	int[] res = new int[n];
	int[] start = new int[n];
	Map<Integer, Integer> lkp = new HashMap<Integer, Integer>();
	
	for ( int i = 0; i < n; i++) {
	    start[i] = intervals[i].start;
	    lkp.put(start[i], i);
	}
	
	Arrays.sort(start);
	int hi, lo;
	for ( int i = 0 ; i < n; i++) {
	    
	    lo = 0;
	    hi = n;
	    
	    while ( lo < hi ) {
		int mid = lo + (hi - lo) / 2;
		if ( intervals[i].end == start[mid]) {
		    lo = mid;
		    break;
		}
		
		if ( intervals[i].end > start[mid]) 
		    hi = mid;
		else
		    lo = mid + 1;
		
	    }
	    
	    res[i] = lo < n ? lkp.get(start[lo]) : -1;
	}
	
	
	return res;
    }
    
}
