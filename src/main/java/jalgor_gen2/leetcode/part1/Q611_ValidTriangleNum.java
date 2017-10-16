package jalgor_gen2.leetcode.part1;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

public class Q611_ValidTriangleNum extends Solution {
   
	public int triangleNumber(int[] nums){
		Arrays.sort(nums);
		int cnt = 0;
		
		for (int i = nums.length - 1; i > 1; i --){
			int l = 0, r = i-1;
			while (l < r){
				if (nums[l] + nums[r] > nums[i]){
					cnt += r - l;
					r--;
				} else
					l++;
			}
		}
		
		return cnt;
	}
	
	
	public int triangleNumber_v1(int[] nums) {
        
		Arrays.sort(nums);
		int cnt = 0;
		
		for(int i = 0; i < nums.length - 2; i++ )
			for (int j = i + 1; j < nums.length - 1; j ++){
				int twosum = nums[i] + nums[j];
				for (int k = j + 1; k < nums.length && nums[k] < twosum; k++)
					cnt += 1;
			}
		
		return cnt;
    }
}
