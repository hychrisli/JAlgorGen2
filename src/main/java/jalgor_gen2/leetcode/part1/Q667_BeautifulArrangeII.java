package jalgor_gen2.leetcode.part1;

import java.util.Arrays;

import jalgor_gen2.leetcode.Solution;

public class Q667_BeautifulArrangeII extends Solution {
    
	public int[] constructArray(int n, int k) {
		int[] res = new int[n];
		
		for ( int i = 0, l = 1, r = n; l <= r; i++){
			
			if (k > 1)
				if ( k -- % 2 == 0 ) 
					res[i] = r -- ;
				else
					res[i] = l ++;
			else
				res[i] = l ++;
		}
		
		return res; 
	}
	
	
	public int[] constructArray_v1(int n, int k) {
        
    	int[] res = new int[n], val = {1, n};
    	int i = 0;
    	
    	while (k > 0){
    		res[i] = val[i % 2];
    		val[i%2] += (1 - (i % 2) * 2);
    		k --;
    		i ++;
    	}
    	
    	for ( int j = i; j < n; j++){
    		res[j] = val[(i+1) % 2] + (i - j) * (1 - (i % 2) * 2);
    	}
    	
    	// log.info(Arrays.toString(res));
    	
    	return res;
    }
}
