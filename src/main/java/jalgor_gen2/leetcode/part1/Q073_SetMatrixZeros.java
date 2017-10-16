package jalgor_gen2.leetcode.part1;

import jalgor_gen2.leetcode.Solution;

public class Q073_SetMatrixZeros extends Solution{
    
	public void setZeroes(int[][] matrix) {
        
		int m = matrix.length, n = matrix[0].length;
		boolean fcol = false;
		
		for (int i = 0; i < m; i ++ ){
			if ( matrix[i][0] == 0) fcol = true;
			for (int j = 1; j < n; j++){
				if (matrix[i][j] == 0){
					matrix[i][0] = matrix[0][j] = 0;
				}
			}
		}
		
		for (int i = m - 1; i >= 0; i --) {
			for ( int j = 1; j < n; j ++ ){
				if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
			}
			if (fcol) matrix[i][0] = 0;
		}		
    }
}
