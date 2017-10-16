package jalgor_gen2.leetcode.part1;

import jalgor_gen2.leetcode.Solution;

public class Q075_SortColors extends Solution {
	
	public void sortColors(int[] nums) {
		
		int zi = 0, ti = nums.length - 1;
		
		for(int i=0; i < nums.length; i++){
			while (nums[i] == 2 && i <= ti){
				nums[i] = nums[ti];
				nums[ti--] = 2;
			}
			
			while (nums[i] == 0 && i >= zi){
				nums[i] = nums[zi];
				nums[zi++] = 0;
			}
		}
    }
	
}
