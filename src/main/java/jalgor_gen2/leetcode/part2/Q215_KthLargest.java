package jalgor_gen2.leetcode.part2;

import java.util.PriorityQueue;

import jalgor_gen2.leetcode.Solution;

public class Q215_KthLargest extends Solution{
    
    // Quick Select v1
    public int findKthLargest(int[] nums, int k) {
	
	int lo = 0, hi = nums.length - 1, pvt = 0;
	
	while ( lo < hi ) {
	    pvt = partition(nums, lo, hi);
	    //System.out.println(pvt);
	    //System.out.println(Arrays.toString(nums));
	    if (pvt == k - 1) return nums[pvt];
	    
	    if (pvt < k)
		lo = pvt + 1;
	    else
		hi = pvt - 1;
	}
	
	return nums[k - 1];
    }
    
    private int partition(int[] nums, int si, int ei) {
	
	int x = nums[ei];
	int pvt = si - 1;
	
	for ( int i = si; i < ei; i++) {
	    if ( nums[i] > x ){
		pvt += 1;
		swap(nums, i, pvt);
	    }
	}
	swap(nums, pvt + 1, ei);
	return pvt + 1;
    }
    
    private void swap(int[] nums, int i, int j) {
	int tmp = nums[j];
	nums[j] = nums[i];
	nums[i] = tmp;
    }
    
    
    // Priority Queue
    public int findKthLargestPQ(int[] nums, int k) {
        
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	
	for ( int i = 0; i < nums.length; i ++) {
	    q.add(nums[i]);
	    if (q.size() > k) q.poll();
	}
	
	return q.peek();
    }
    
}
