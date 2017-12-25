package jalgor_gen2.leetcode.part2;

import java.util.HashMap;
import java.util.Map;

import jalgor_gen2.leetcode.Solution;

public class Q220_ContainDuplicateThree extends Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

	if ( t < 0 || k < 1 || nums.length < 1) return false;
	
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	int w = t + 1;

	for (int i = 0; i < nums.length; i++) {

	    int bId = getBucketId(nums[i], w);
	    // System.out.println(bId);
	    if (map.containsKey(bId))
		return true;
	    if (map.containsKey(bId - 1) && Math.abs((long) map.get(bId - 1) - nums[i]) <= t)
		return true;
	    if (map.containsKey(bId + 1) && Math.abs((long) map.get(bId + 1) - nums[i]) <= t)
		return true;
	    map.put(bId, nums[i]);
	    if ( i >= k)
		map.remove(getBucketId(nums[i - k], w));
	}
	return false;
    }

    private static int getBucketId(int num, int w) {
	return num >= 0 ? num / w : num / w - 1;
    }

}
