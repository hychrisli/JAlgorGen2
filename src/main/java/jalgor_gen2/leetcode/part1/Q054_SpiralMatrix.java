package jalgor_gen2.leetcode.part1;

import java.util.ArrayList;
import java.util.List;

import jalgor_gen2.leetcode.Solution;

public class Q054_SpiralMatrix extends Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
    	int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    	List<Integer> res = new ArrayList<Integer>();
    	if (matrix.length == 0) return res;
    	
    	int m = matrix.length, n = matrix[0].length;
    	int[] steps = {n, m-1};
    	int iDir = 0, ir = 0, ic = -1;
    	
    	while (steps[iDir % 2] > 0){
    		
    		for (int i = 0; i < steps[iDir%2]; i++){
    			ir += dirs[iDir][0];
    			ic += dirs[iDir][1];
    			res.add(matrix[ir][ic]);
    		}
    		
    		steps[iDir % 2] --;
    		iDir = (iDir + 1) % 4;
    	}
    	return res;
    }
}
