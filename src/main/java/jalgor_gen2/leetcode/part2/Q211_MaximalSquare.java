package jalgor_gen2.leetcode.part2;

public class Q211_MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        
	if ( matrix.length == 0 ) return 0;
	int m = matrix.length, n= matrix[0].length;
	int[][] dp = new int[m][n];
	int maxEdge = 0;
	
	for ( int i = 0; i < m; i++ ){
	    dp[i][0] = matrix[i][0] - '0';
	    maxEdge = Math.max(dp[i][0], maxEdge);
	}

	for ( int j = 0; j < n; j++){
	    dp[0][j] = matrix[0][j] - '0';
	    maxEdge = Math.max(dp[0][j], maxEdge);
	}  
	
	for ( int i = 1; i < m; i ++ ) {
	    for ( int j = 1; j < n; j ++) {
		if ( matrix[i][j] == '1') {
		    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) + 1;
		    maxEdge = Math.max(dp[i][j], maxEdge);
		}
	    }
	}

	return maxEdge * maxEdge;
    }
    
}
