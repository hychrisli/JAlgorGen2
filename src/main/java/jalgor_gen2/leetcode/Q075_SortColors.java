package jalgor_gen2.leetcode;

import java.util.logging.Logger;

public class Q075_SortColors {
    
	private static Logger log = Logger.getLogger(Q075_SortColors.class.getName());
	
	public void sortColors(int[] nums) {
		
		int zi = 0, ti = nums.length - 1;
		
		for(int i=0; i < nums.length; i++){
			// log.info(Arrays.toString(nums));
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
