package jalgor_gen2.leetcode.part2;

import jalgor_gen2.leetcode.Solution;

public class Q718_CommonSubArrayMaxLen extends Solution {
    public int findLength(int[] A, int[] B) {
        int m = A.length, n = B.length, max = 0;;
	// the max common len of sub-arrays end with A[i] and B[i]
        int[][] dp = new int[m + 1][n + 1];
	
	for ( int i = 1; i <= m; i++) {
	    for ( int j = 1; j <= n; j++){
		dp[i][j] = A[i-1] == B[j-1] ? dp[i-1][j-1] + 1 : 0; 
		max = Math.max(dp[i][j], max);
	    }
	}
	return max;
    }
}
