package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jalgor_gen2.leetcode.Solution;
import structure.Interval;

public class Q056_MergeIntervals extends Solution {
    public List<Interval> merge(List<Interval> intervals) {
    	
    	if (intervals.isEmpty()) return intervals;
    	
    	Collections.sort(intervals, (a, b)-> a.start < b.start ? -1 : a.start == b.start ? 0 : 1 );
    	List<Interval> res = new ArrayList<Interval>();
    	
    	Interval curIntvl = intervals.get(0);
    	
    	for ( Interval interval : intervals ){
    		if( interval.start <= curIntvl.end ) 
    			curIntvl.end = Math.max(curIntvl.end, interval.end);
    		else {
    			res.add(curIntvl);
    			curIntvl = interval;
    		}
    	}
    	
    	res.add(curIntvl);
    	
    	return res;
    }
}
