package jalgor_gen2.leetcode.part1;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

public class Q048_RotateImage extends Solution {
   
	public void rotate(int[][] matrix) {
		
		int n = matrix.length;
		
		for ( int i = 0; i < n/2; i ++)
			for ( int j = 0; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-i-1][j];
				matrix[n-i-1][j] = temp;
			}
		
		for ( int i = 0; i < n; i ++ )
			for ( int j = i + 1; j < n; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
    }
}
