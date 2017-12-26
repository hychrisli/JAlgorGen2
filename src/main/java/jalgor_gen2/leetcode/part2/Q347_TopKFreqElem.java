package jalgor_gen2.leetcode.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jalgor_gen2.leetcode.Solution;

public class Q347_TopKFreqElem extends Solution {
    
    // Array of Lists
    public List<Integer> topKFrequent(int[] nums, int k) {
	
	@SuppressWarnings("unchecked")
	List<Integer>[] buckets = new List[nums.length + 1];
	Map<Integer, Integer> cntMap = new HashMap<Integer, Integer>();
	List<Integer> res = new ArrayList<Integer>();
	
	
	for (int i = 0; i < nums.length; i++)
	    cntMap.put(nums[i], cntMap.getOrDefault(nums[i], 0) + 1);
	
	for (Map.Entry<Integer, Integer> entry : cntMap.entrySet()){
	    int id = entry.getValue();
	    if (buckets[id] == null)
		buckets[id] = new ArrayList<Integer>();
	    buckets[id].add(entry.getKey());
	}
	
	for (int i = nums.length; i > 0 && k > 0; i--) {
	    if (buckets[i] != null) {
		res.addAll(buckets[i].subList(0, Math.min(k, buckets[i].size())));
		k -= buckets[i].size();
	    }
	}
	return res;
    }
    
    
    
    // List of lists
    public List<Integer> topKFrequentV1(int[] nums, int k) {

	int n = nums.length;
	Map<Integer, Integer> cntMap = new HashMap<Integer, Integer>();
	List<List<Integer>> buckets = new ArrayList<List<Integer>>();
	List<Integer> res = new ArrayList<Integer>();

	for (int i = 0; i < n; i++) {
	    cntMap.put(nums[i], cntMap.getOrDefault(nums[i], 0) + 1);
	    buckets.add(null);
	}

	for (Map.Entry<Integer, Integer> entry : cntMap.entrySet()) {
	    // System.out.println(entry.getKey() + " " + entry.getValue());
	    List<Integer> bList = buckets.get(entry.getValue() - 1);
	    if (bList == null) {
		bList = new ArrayList<Integer>();
		bList.add(entry.getKey());
		buckets.set(entry.getValue() - 1, bList);
	    } else
		bList.add(entry.getKey());
	}

	for (int i = n - 1; i >= 0 && k > 0; i--) {

	    List<Integer> bList = buckets.get(i);

	    if (bList != null) {
		// System.out.println(i + ", " +
		// Arrays.toString(bList.toArray()));
		res.addAll(bList.subList(0, Math.min(k, bList.size())));
		k -= bList.size();
	    }
	}
	return res;
    }

}
