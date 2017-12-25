package jalgor_gen2.leetcode.part2;

import java.util.TreeMap;

import jalgor_gen2.leetcode.Solution;

public class Q729_MyCalendarOne extends Solution {
    
    public Q729_MyCalendarOne() {
    }

    TreeMap<Integer, Integer> cal = new TreeMap<Integer, Integer>();
    
    public boolean book(int start, int end) {
	Integer floorKey = cal.floorKey(end - 1);
	if (floorKey != null && cal.get(floorKey) > start)
	    return false;
	cal.put(start, end);
	return true;
    }
}
