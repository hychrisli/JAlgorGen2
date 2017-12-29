package jalgor_gen2.leetcode.part2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

import jalgor_gen2.leetcode.Solution;

public class Q460_LFUCache extends Solution {

    Map<Integer, Integer> values = new HashMap<Integer, Integer>();
    Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    Map<Integer, LinkedHashSet<Integer>> buckets = new HashMap<Integer, LinkedHashSet<Integer>>();

    int capacity, minCnt;

    public Q460_LFUCache(int capacity) {
	this.capacity = capacity;
	minCnt = 1;
    }

    public int get(int key) {
	if (!values.containsKey(key))
	    return -1;
	update(key);
	return values.get(key);
    }

    public void put(int key, int value) {

	if (capacity > 0) {
	    
	    values.put(key, value);

	    if (values.size() > capacity) {
		Integer rmKey = buckets.get(minCnt).iterator().next();
		buckets.get(minCnt).remove(rmKey);
		values.remove(rmKey);
		counts.remove(rmKey);
	    }

	    update(key);
	}

    }

    private void update(int key) {
	Integer cnt = counts.getOrDefault(key, 0);
	counts.put(key, cnt + 1);

	if (buckets.containsKey(cnt)) {
	    buckets.get(cnt).remove(key);
	    if (cnt == minCnt && buckets.get(cnt).size() == 0)
		minCnt += 1;
	} else
	    minCnt = 1;

	if (buckets.containsKey(cnt + 1))
	    buckets.get(cnt + 1).add(key);
	else {
	    LinkedHashSet<Integer> keySet = new LinkedHashSet<Integer>();
	    keySet.add(key);
	    buckets.put(cnt + 1, keySet);
	}
    }

}
