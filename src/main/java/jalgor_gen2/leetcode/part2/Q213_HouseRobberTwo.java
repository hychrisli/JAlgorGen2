package jalgor_gen2.leetcode.part2;

public class Q213_HouseRobberTwo {

    public int rob(int[] nums) {

	if (nums.length == 1)
	    return nums[0];

	return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));

    }

    private int rob(int[] nums, int start, int end) {

	int last = 0, now = 0;

	for (int i = start; i < end; i++) {
	    int next = last + nums[i];
	    next = Math.max(next, now);
	    last = now;
	    now = next;
	}
	return now;
    }

}
