package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import jalgor_gen2.leetcode.Solution;

public class Q731_MyCalendarTwo extends Solution{
    
    public Q731_MyCalendarTwo() {
        
    }
    
    List<int[]> cal = new ArrayList<int[]> ();
    TreeMap<Integer, Integer> overlap = new TreeMap<Integer, Integer>();
    
    public boolean book(int start, int end) {
	
	Integer olFlrKey = overlap.floorKey(end - 1);
	
	if (olFlrKey != null && overlap.get(olFlrKey) > start)
	    return false;
	
	for (int[] book : cal) {
	    int olStart = Math.max(start, book[0]);
	    int olEnd = Math.min(end, book[1]);
	    
	    if (olStart < end && olEnd > start)
		if (! overlap.containsKey(olStart) || overlap.get(olStart) < olEnd)
		    overlap.put(olStart, olEnd);
	}
	
	cal.add(new int[]{start, end});
	return true;
    }
    
}
