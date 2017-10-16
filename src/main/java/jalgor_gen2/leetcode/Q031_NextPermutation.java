package jalgor_gen2.leetcode;

public class Q031_NextPermutation extends Solution {
	public void nextPermutation(int[] nums) {

		int n = nums.length , k = n - 1;
		if ( n < 2 ) return;
		
		while ( k > 0 && nums[k] <= nums[k-1]) k--;
		
		if ( k == 0 ){
			for ( int i = 0; i < n / 2; i++){
				this.swap(nums, i, n-i-1);
			}
			return;
		}
		
		for ( int j = nums.length - 1; j >= k; j--){
			if ( nums[j] > nums[k-1]){
				this.swap(nums, j, k-1);
				int mid = (n - k) / 2 + k;
				for ( int t = k; t < mid; t++){
					this.swap(nums, t, n-t+k-1);
				}
				return;
			}
		}
	}
	
	public void swap(int[] nums, int i1, int i2){
		int tmp = nums[i1];
		nums[i1] = nums[i2];
		nums[i2] = tmp;
	}
}
